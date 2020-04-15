function singIn(provider, txt) {
    provider.addScope(txt)

    firebase.auth().signInWithPopup(provider)
        .then(result => window.location.href = `areaCliente.html?nome=${result.user.displayName}&foto=${result.user.photoURL}`)
        .catch(error => alert('Falha ao tentar logar pelo'))
}

document.getElementById('loginGoogle').addEventListener('click', e => {
    e.preventDefault()

    let provider = new firebase.auth.GoogleAuthProvider()

    singIn(provider, 'https://www.googleapis.com/auth/contacts.readonly')

})

document.getElementById('loginFacebook').addEventListener('click', e => {
    e.preventDefault()

    let provider = new firebase.auth.FacebookAuthProvider()

    singIn(provider, 'user_birthday')
})

document.getElementById('loginGitHub').addEventListener('click', e => {
    e.preventDefault()

    let provider = new firebase.auth.GithubAuthProvider()

    singIn(provider, 'rep')
})
