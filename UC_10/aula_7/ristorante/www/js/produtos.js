/*const objProdutos = [
    {
        id: 1,
        nome: 'Super Monstrão Burger',
        descricao: '800g de Hambúrguer de filé mignon + batata frita',
        valor: 'R$ 18,90',
        url: ['brand', 'default', 'default'],
    },
    {
        id: 2,
        nome: 'Burger',
        descricao: '15 de Hambúrguer de filé mignon + batata frita + Refri',
        valor: 'R$ 12,90',
        url: ['default', 'default', 'default'],
    },
    {
        id: 3,
        nome: 'Double Monstrer',
        descricao: 'X2 - 800g de Hambúrguer de filé mignon',
        valor: 'R$ 60,90',
        url: ['doubleBurguer', 'default', 'default'],
    },
    {
        id: 4,
        nome: 'Best Burger',
        descricao: '500g de Hambúrguer de filé mignon + batata frita + Refri',
        valor: 'R$ 22,80',
        url: ['default2', 'default', 'default'],
    },
    {
        id: 5,
        nome: 'Hamburguinho',
        descricao: '180g de Hambúrguer de filé mignon + batata frita + Refri',
        valor: 'R$ 15,00',
        url: ['hamburguinho', 'default', 'default'],
    },
    {
        id: 6,
        nome: 'Super Picanha',
        descricao: '500g de Hambúrguer de picanha + batata frita',
        valor: 'R$ 30,90',
        url: ['default2', 'default', 'default'],
    },
    {
        id: 7,
        nome: 'Picanhia',
        descricao: '180 de Hambúrguer de filé mignon + batata frita + Refri',
        valor: 'R$ 25,90',
        url: ['default', 'default', 'default'],
    },
    {
        id: 8,
        nome: 'Super Costela',
        descricao: '800g de Hambúrguer de costela + batata frita',
        valor: 'R$ 28,90',
        url: ['costela', 'default', 'default'],
    },
    {
        id: 9,
        nome: 'Costelinha',
        descricao: '180g de Hambúrguer de costela + batata frita + Refri',
        valor: 'R$ 22,90',
        url: ['costelinha', 'default', 'default'],
    },
    {
        id: 10,
        nome: 'Double Burguer',
        descricao: 'X2 - 280g de Hambúrguer de costela',
        valor: 'R$ 40,00',
        url: ['doubleBurguer', 'default', 'default'],
    },
]*/

firebase.database().ref('produtos').on('value', function(snapshot){
    preencherProdutos(snapshot)
})

function verMaisProduto(idProd) {
    firebase.database().ref('produtos').child(`/${idProd}`).on('value', productResult => {
        document.querySelector('.produtos').innerHTML = ''
        document.getElementById('titulo').style.display = 'none'
        let str = ''

        str += `
            <h3 class="text-rock nome-burger h3-title">${productResult.val().nome}<h3>
            <div class="produto-item col-direction">
                <div class="foto-produtos">
                    <span class="foto-produtos foto-produtos-grid1 "><img src="${productResult.val().fotos[0]}" alt="Foto1"></span>
                    <span class="foto-produtos foto-produtos-grid2">
                        <img src="${productResult.val().fotos[1]}" alt="Foto2">
                        <img src="${productResult.val().fotos[2]}" alt="Foto3">
                    </span>
                </div>
                <div class="info">
                    <p class="margin text-main descricao text-plus">${productResult.val().descricao}</p>
                    <p class="margin text-main text-plus">R$ <span id="valorUni">${productResult.val().valor}</span> x <span id="quant">1</span> = <span id="total">${productResult.val().valor}</span></p>
                    <div class="options">
                        <div class="plusAndMinus">
                            <button type="button" class="btn-danger" onclick="minusProduct()">-</button>
                            <input type="text" value="1" id="qtde" name="qtde">
                            <button type="button" class="btn-primary" onclick="addProduct()">+</button>
                        </div>

                        <div class="buttons">
                            <button class="text-rock" onclick="finalizarPedido('${idProd}')">Finalizar</button>
                            <button class="text-rock btn-danger" onclick="window.location.href='index.html'">Cancelar</button>
                        </div>
                    </div>
                </div>
            </div>
        `
        document.querySelector('.produtos').innerHTML = str; 
    })
}

function finalizarPedido(idProd) {
    window.scrollTo({
        'behavior': 'smooth',
        'left': 0,
        'top': document.querySelector('body').offsetTop
    })

    let objSelected = objProdutos[idProd-1]
    let node = document.createElement('DIV')
    node.classList.add('modal') 
    let str = ''

    str += `
        <span>
            <p class="text-plus text-main">O seu pedido do</p>
            <h3 class="text-rock nome-burger text-plus">${objSelected.nome}</h3>
            <p class="text-plus text-main">Foi realizado com sucesso !!!</p>
        </span>
    `

    node.innerHTML = str
    document.querySelector('.produtos').appendChild(node)

    setTimeout(() => {
        document.querySelector('.produtos').removeChild(document.querySelector('div.modal'))
        window.location.href="index.html"
    }, 3000)
}

function preencherProdutos(produtos) {
    let str = ''
    produtos.forEach(function(obj) {
        str += `
            <div class="produtos-item">
            <div class="foto-produto"><img src="${obj.val().fotos[0]}" alt="${obj.val().nome}"></div>
                <div class="info">
                    <h3 class="text-rock nome-burger">${obj.val().nome}</h3>
                    <p class="margin text-main descricao">${obj.val().descricao}</p>
                    <p class="margin text-main">R$ ${obj.val().valor}</p>
                    <button onclick="verMaisProduto('${obj.key}')" class="ver-mais margin text-rock" id="${obj.key}">Pedir</button>
                </div>
            </div>
        `
    })
    document.querySelector('.produtos').innerHTML = str;
}

function addProduct() {
   let qtde = parseInt(document.getElementById('qtde').value)
   let uni = parseFloat(document.getElementById('valorUni').innerText).toFixed(2)

    qtde = qtde + 1  
    document.getElementById('qtde').value = qtde
    document.getElementById('quant').innerText = qtde
    document.getElementById('total').innerText = (uni * qtde).toFixed(2)
}

function minusProduct() {
    let qtde = parseInt(document.getElementById('qtde').value)
    let uni = parseFloat(document.getElementById('valorUni').innerText).toFixed(2)

    qtde = qtde - 1 
    if(qtde >= 1) {
        document.getElementById('qtde').value = qtde
        document.getElementById('quant').innerText = qtde
        document.getElementById('total').innerText = (uni * qtde).toFixed(2)
    }
}