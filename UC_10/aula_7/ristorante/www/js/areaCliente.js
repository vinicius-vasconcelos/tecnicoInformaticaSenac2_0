(function() {
    let url = window.location.search.split('=')
    let name = url[1].split('&')[0]
    let email = url[2]
   document.querySelector('p.text-main').innerHTML = `Olá ${name}, <br> Você se logou com ${email}`

    console.log()
}())