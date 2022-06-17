/*Some todos os números de um array
Crie uma função que recebe uma lista de preços e um número representando o saldo disponível.*/

function somaNumeros(array){
    return array.reduce(function(valorAtual, valorAnterior){
        console.log({valorAtual});
        console.log({valorAnterior});
        return valorAtual + valorAnterior;
    });
}

const arr = [1, 2];

console.log(somaNumeros(arr));