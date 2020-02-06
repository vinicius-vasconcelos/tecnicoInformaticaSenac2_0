(function(){
    let bd = [
        {
            name: 'Vinicius',
            url: './img/lindo8.jfif',
            desc: 'Cientista da Computação',
        },
        {
            name: 'Pedro',
            url: './img/lindo2.jpg',
            desc: 'Engenheiro Mecânico',
        },
        {
            name: 'Marcelo ',
            url: './img/lindo6.jpg',
            desc: 'Advogado',
        },
        {
            name: 'Joséfina',
            url: './img/lindo5.jpg',
            desc: 'Professora',
        },
        {
            name: 'Maria',
            url: './img/lindo3.jpg',
            desc: 'Historiadora',
        },
        {
            name: 'Clovis',
            url: './img/lindo1.jpg',
            desc: 'Fisioterapeuta',
        },
        {
            name: 'Clodoaldo',
            url: './img/lindo7.jpg',
            desc: 'Coach',
        },
        {
            name: 'Tempestade',
            url: './img/lindo4.jpg',
            desc: 'Atriz',
        },
        
    ];

    let main = document.getElementById('main');
    let str = '';

    for (let i = 0; i < bd.length; i++) {
        str += `
            <div class="card container-flex-center">
                <div class="img"><img src="${bd[i].url}" alt=""></div>

                <div class="info">
                    <h2>${bd[i].name}</h2>
                    <p>${bd[i].desc}</p>
                    <button>Ver mais</button>
                </div>
            </div>
        `
    }

    main.innerHTML = str;
}());

function ativarMeu() {

    let state = document.getElementById('menu').getAttribute('data-target');

    if(state == 'false') {
        document.getElementById('nav').style.display = 'block';
        document.getElementById('menu').setAttribute('data-target', 'true');
    } else {
        document.getElementById('nav').style.display = 'none';
        document.getElementById('menu').setAttribute('data-target', 'false');
    }
}