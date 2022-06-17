/*Calcule qual será o saldo final após subtrair todos os preços da lista enviada.*/

const lista = [
    {
        nome: 'sabao em po',
        preco: 30,
    },
    {
        nome: 'cereal',
        preco: 12,
    },
    {
        nome: 'toalha',
        preco: 30,
    },
];

const saldoDisponivel = 100;

function calculaSaldo(saldoDisponivel, lista){
    return lista.reduce(function(anterior, atual, index){
        console.log("Rodada: ", index + 1);
        console.log({atual});
        console.log({anterior});
        return anterior - atual.preco;
    }, saldoDisponivel) 
    
}

console.log(calculaSaldo(saldoDisponivel, lista));