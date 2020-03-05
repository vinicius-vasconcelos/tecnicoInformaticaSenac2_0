const objProdutos = [
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
]

function verMaisProduto(idProd) {
    document.querySelector('.produtos').innerHTML = ''
    document.getElementById('titulo').style.display = 'none'
    let objSelected = objProdutos[idProd-1];
    let str = ''

        str += `
            <h3 class="text-rock nome-burger h3-title">${objSelected.nome}<h3>
            <div class="produto-item col-direction">
                <div class="foto-produtos">
                    <span class="foto-produtos foto-produtos-grid1 "><img src="./img/${objSelected.url[0]}.jpg" alt=""></span>
                    <span class="foto-produtos foto-produtos-grid2">
                        <img src="./img/${objSelected.url[1]}.jpg" alt="">
                        <img src="./img/${objSelected.url[2]}.jpg" alt="">
                    </span>
                </div>
                <div class="info">
                    <p class="margin text-main descricao text-plus">${objSelected.descricao}</p>
                    <p class="margin text-main text-plus">${objSelected.valor}</p>
                    <div class="options">
                        <div class="plusAndMinus">
                            <button class="btn-danger">-</button>
                            <input type="number">
                            <button class="btn-primary">+</button>
                        </div>

                        <div class="buttons">
                            <button class="text-rock" onclick="finalizarPedido('${objSelected.id}')">Finalizar</button>
                            <button class="text-rock btn-danger" onclick="window.location.href='index.html'">Cancelar</button>
                        </div>
                    </div>
                </div>
            </div>
        `
    document.querySelector('.produtos').innerHTML = str;
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

function preencherProdutos() {
    let str = ''
    objProdutos.map( obj => {
        str += `
            <div class="produtos-item">
                <div class="foto-produto"><img src="./img/${obj.url[0]}.jpg" alt=""></div>
                <div class="info">
                    <h3 class="text-rock nome-burger">${obj.nome}</h3>
                    <p class="margin text-main descricao">${obj.descricao}</p>
                    <p class="margin text-main">${obj.valor}</p>
                    <button onclick="verMaisProduto('${obj.id}')" class="ver-mais margin text-rock" id="${obj.id}">Pedir</button>
                </div>
            </div>
        `
    })
    document.querySelector('.produtos').innerHTML = str;
}

preencherProdutos()