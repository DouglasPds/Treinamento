/*const vaca = (car1, car2) => car1 + car2

const soma1 = nois => nois + 1

console.log(vaca(9, 11))
console.log(soma1(99))*/

// let a = { valor: 33 }
// let b = a
//
// b.valor += 1
//
// console.log(a,b)
//
// let n = new Number(10)
//
// console.log(n)
//
// let moto = {
//     cor: "vermelha",
//     marca: "honda",
//     met1: function () {
//         console.log('oi sumida!')
//     }
// }
//
// let xj6 = {
//     cor: "branco",
//     marca: "yamaha",
//     met2: function (cor) {
//         this.cor = cor
//         return this.cor
//     }
// }
//
// function Motoca(cor, marca) {
//     let cor = cor
//     this.marca = marca
//
//     this.contaMoto = function(){
//
//     }
//
//     Motoca.prototype.getCor = function () {
//         return this.cor
//     }
// }
//
// function Carro(cor, banco) {
//     return {
//         cor,
//         banco,
//         mudaBanco: function (banco){
//             this.banco = banco
//         }
//     }
// }
//
// let vendas = new Motoca('roxo')
//
// let vendido = Carro('prata', 'couro')

//let valor = prompt('Digite o nome do atributo: ')
// console.log(xj6, moto)
// moto.met1()
// console.log(xj6.met2('verde'))
// console.log(xj6)
// console.log(vendas)
// vendido.banco = 'pano'
// console.log(vendido.banco)

// class Xbox {
//
//     horasJogo = 30005689
//
//     constructor(qtdControles, estiloJogo) {
//         this.qtdControles = qtdControles
//         this.estiloJogo = estiloJogo
//     }
//
//     mostrarHorasJogo() {
//         console.log(this.horasJogo)
//     }
//
// }
//
// let jaComprei = new Xbox(4,'tiroteio')
//
// jaComprei.mostrarHorasJogo()
//
// console.table(jaComprei)
//
// for (let nome in jaComprei) {
//     console.log(nome)
// }
//
// for (let valor in jaComprei) {
//     console.log(jaComprei[valor])
// }
//
// delete jaComprei.horasJogo
//
// if ('horasJogo' in jaComprei) {
//     console.log('Esse atributo exist')
// } else console.log('Esse atributo non exist')
//
// console.table(jaComprei)
//
// let milho = [1,2,7,8]
//
// for (let milhao of milho) {
//     console.log(milhao)
// }
//
// console.log((12.9333333).toFixed(2))

// let fabrica = document.getElementById('car')
//
// fabrica.innerHTML = 'Se juntar fica mais bonito'
//
// console.log(fabrica)
//
// // document.head.innerHTML = '<link rel="stylesheet" href="bonito.css">'
// //
// // document.body.style.background = 'url("coringa.jpg")'
//
//
// function meiaNoite(){
//     document.body.style.backgroundColor = '#1f2b50'
//     document.body.style.color = '#000'
//     document.body.innerHTML += '<h1>Modo noturno ATIVADO</h1>'
// }
//
// let digitei = document.getElementsByTagName('form')[0]
//
// digitei.addEventListener('submit', Festa => {
//     Festa.preventDefault()
//     console.log(digitei.MauEducado.value)
// })
//
// let acabando = document.querySelectorAll('.lindo')
//
// console.log(acabando)

let rede = [2,76,14]

function somaEfazMaisAlgo(a, b, callback) {
    const soma = a + b
    callback(soma, 'teste')
}

somaEfazMaisAlgo(2, 4, (soma, frase, proximo) => console.log(soma, frase, proximo))

let contei = rede.find(numero => numero > 7)

const two = 26

rede.forEach((numero, indice, vet, ninguem) => console.log(numero + 2, indice, vet, ninguem))

let soninho = [
    {
        nome: 'Goku',
        QtdKi: 12000,
        numDeaths: 'menos que o kuririm'
    },
    {
        nome: 'Vegeta',
        QtdKi: 7999
    },
    {
        nome: 'Kuririn',
        QtdKi: 2,
        numDeaths: Infinity
    },
    {
        nome: 'Cell',
        QtdKi: 10000
    },
    {
        nome: 'Freeza',
        QtdKi: 11999
    }
]

//soninho.forEach(lenda => console.log(lenda))

let sayajeans = soninho.map(lenda => (
    {nome: lenda.nome, filho: lenda.nome === 'Goku' ? 'Gohan' : 'Trunks'}
))
console.log(sayajeans);

let brucutus = soninho.filter(guerreiro => guerreiro.QtdKi < 8000);

console.log(brucutus);

let continha = soninho.map(lenda => lenda.QtdKi).filter(Ki => Ki > 8000).reduce((Enem, ki) => Enem + ki, 0);

console.log(continha);

let {nome, QtdKi, numDeaths} = soninho[0];

console.log(nome, QtdKi, numDeaths);




