/*Crie uma função que recebe o array alunos e um número que irá representar a média final;
Percorra o array e popule um novo array auxiliar apenas com os alunos cujas notas são maiores ou iguais à média final;
Utilize a técnica "object destructuring" para manipular as propriedades desejadas de cada aluno.*/


const alunos = [
    {
        nome: 'Eric',
        nota: '7',
        turma: '1a',

    },

    {
        nome: 'Bruna',
        nota: '8',
        turma: '1b',
    },

    {
        nome: 'Nathalia',
        nota: '4',
        turma: '1c',
    },


]


function alunosAprovados(alunos, media){
    let aprovados = []

    for(let i = 0; i < alunos.length; i++){
            let {nota, nome} = alunos[i];

            if (nota >= media) {
                aprovados.push(nome);
            }
        
    }

    return aprovados;
}

console.log(alunosAprovados(alunos, 7));