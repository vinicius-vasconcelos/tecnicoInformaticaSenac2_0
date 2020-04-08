document.getElementById('loginGoogle').addEventListener('click', e => {
    e.preventDefault()

    let provider = new firebase.auth.GoogleAuthProvider()
    provider.addScope('https://www.googleapis.com/auth/contacts.readonly')

    firebase.auth().signInWithPopup(provider)
        .then(result => {
            console.log('blz mlkoti bora la')
            console.log(result.credential.accessToken)
            console.log(result.user)

            window.location.href = `areaCliente.html?user=${result.user.displayName}&email=${result.user.email}`
        })
        .catch(error => {
            console.log('reouuuuuuuuuuuuuuuuuuu')
            console.log(error.code)
            console.log(error.message)
            console.log(error.email)
            console.log(error.credential)
        })
})

document.getElementById('loginFacebook').addEventListener('click', e => {
    e.preventDefault()

    let provider = new firebase.auth.GoogleAuthProvider()
    provider.addScope('https://www.googleapis.com/auth/contacts.readonly')

    firebase.auth().signInWithPopup(provider)
        .then(result => {
            console.log('blz mlkoti bora la')
            console.log(result.credential.accessToken)
            console.log(result.user)
            console.log(result.user.displayName)
            console.log(result.user.email)
            console.log(result.user.displayName)
        })
        .catch(error => {
            console.log('reouuuuuuuuuuuuuuuuuuu')
            console.log(error.code)
            console.log(error.message)
            console.log(error.email)
            console.log(error.credential)
        })
})