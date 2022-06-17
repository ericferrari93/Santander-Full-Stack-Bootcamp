/*Filtre e retorne todos os números pares de um array.*/

function filtraPares(arr) {
	return arr.filter(callback);
}

function callback(item){
    return item % 2 === 0;

}

const meuAray = [1, 2, 3, 4, 8, 9, 12, 14];

console.log(filtraPares(meuAray));