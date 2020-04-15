function logout() {
    firebase.auth().signOut().then(function() {
      window.location.href='login.html'
      }).catch(function(error) {
        console.log('err')
      });
      
}

(function() {
    let vetData = window.location.search.split('=')
    let nome = vetData[1].split('&')[0].replace(/%20/gi, ' ')
    let foto = vetData[2]
    document.getElementById('foto').setAttribute('src', foto)
    document.getElementById('nome').innerText = nome;
}())