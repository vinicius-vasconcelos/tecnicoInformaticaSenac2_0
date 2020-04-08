var photoCount = 0;

function __uploadFoto(filePhoto, newProduct) {
    let storageRef
    let uploadTask

    storageRef = firebase.storage().ref(`/superBking/${new Date().getTime()}_${filePhoto.files[0].name}`)
    uploadTask = storageRef.put(filePhoto.files[0])

    uploadTask.on('state_changed', snapshot => {
        let progress = (snapshot.bytesTransferred / snapshot.totalBytes) * 100

        document.querySelector(`small[data-name='${filePhoto.id}']`).innerText = `${progress.toFixed(2)}%`
    }, err => {
        return 'Falha de upload'

    }, () => { 
        uploadTask.snapshot.ref.getDownloadURL().then(function(downloadURL) {
            photoCount--
            newProduct.fotos.push(downloadURL)
            if(photoCount == 0)
                saveProduct(newProduct) 
        });
    })
}

function saveProduct(product) {
    firebase.database().ref().child('produtos').push(product)
   setTimeout(() => window.location.href = 'index.html' , 1000);
}

document.getElementById('form-cadastro').addEventListener('submit', async data => {
    data.preventDefault()

    const formData = document.forms['form-cadastro']
    const dataObj = {
        nome: formData.nome.value,
        descricao: formData.descricao.value,
        valor: formData.preco.value,
        fotos: []
    }

    if(formData.foto1.value !== '')
       __uploadFoto(formData.foto1, dataObj)
    if(formData.foto2.value !== '')
        __uploadFoto(formData.foto2, dataObj)
    if(formData.foto3.value !== '')
        __uploadFoto(formData.foto3, dataObj)
})


function readURL(url) {
    let fReader = new FileReader();

    fReader.readAsDataURL(url.files[0])

    fReader.onloadend = function(event) {

        let img = document.createElement('IMG')
            img.setAttribute('src', event.target.result)
            img.classList.add('img-foto')
            img.setAttribute('id', `${new Date().getTime()}_${url.files[0].name}`)

        document.getElementById(`${url.id}-carregada`).innerHTML = ''
        document.getElementById(`${url.id}-carregada`).appendChild(img)
        document.getElementById(`${url.id}-carregada`).style.border = 'none'
    }

    photoCount++;
};