const objProdutos = [
    {
        id: 1,
        nome: 'Super Monstrão Burger',
        descricao: '800g de Hambúrguer de filé mignon + batata frita',
        valor: 'R$ 18,90',
        url: 'brand'
    },
    {
        id: 2,
        nome: 'Burger',
        descricao: '15 de Hambúrguer de filé mignon + batata frita + Refri',
        valor: 'R$ 12,90',
        url: 'default'
    },
    {
        id: 3,
        nome: 'Double Monstrer',
        descricao: 'X2 - 800g de Hambúrguer de filé mignon',
        valor: 'R$ 60,90',
        url: 'doubleBurguer'
    },
    {
        id: 4,
        nome: 'Best Burger',
        descricao: '500g de Hambúrguer de filé mignon + batata frita + Refri',
        valor: 'R$ 22,80',
        url: 'default2'
    },
    {
        id: 5,
        nome: 'Hamburguinho',
        descricao: '180g de Hambúrguer de filé mignon + batata frita + Refri',
        valor: 'R$ 15,00',
        url: 'hamburguinho'
    },
    {
        id: 6,
        nome: 'Super Picanha',
        descricao: '500g de Hambúrguer de picanha + batata frita',
        valor: 'R$ 30,90',
        url: 'default2'
    },
    {
        id: 7,
        nome: 'Picanhia',
        descricao: '180 de Hambúrguer de filé mignon + batata frita + Refri',
        valor: 'R$ 25,90',
        url: 'default'
    },
    {
        id: 8,
        nome: 'Super Costela',
        descricao: '800g de Hambúrguer de costela + batata frita',
        valor: 'R$ 28,90',
        url: 'costela'
    },
    {
        id: 9,
        nome: 'Costelinha',
        descricao: '180g de Hambúrguer de costela + batata frita + Refri',
        valor: 'R$ 22,90',
        url: 'costelinha'
    },
    {
        id: 10,
        nome: 'Double Burguer',
        descricao: 'X2 - 280g de Hambúrguer de costela',
        valor: 'R$ 40,00',
        url: 'doubleBurguer'
    },
]

function preencherProdutos() {
    let str = ''
    objProdutos.map( obj => {
        str += `
            <div class="produtos-item">
                <div class="foto-produto"><img src="./img/${obj.url}.jpg" alt=""></div>
                <div class="info">
                    <h3 class="text-rock nome-burger">${obj.nome}</h3>
                    <p class="margin text-main descricao">${obj.descricao}</p>
                    <p class="margin text-main">${obj.valor}</p>
                    <button class="ver-mais margin text-rock" id="${obj.id}">Pedir</button>
                </div>
            </div>
        `
    })

    document.querySelector('.produtos').innerHTML = str;
}

preencherProdutos()