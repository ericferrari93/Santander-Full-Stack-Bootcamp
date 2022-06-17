/*Crie uma função getAdmins que recebe um Map;
Crie um Map e popule-o com nomes de usuários e seus papeis no sistema. (Ex: 'Luiz' => 'Admin');
Dentro de getAdmins, utilize o loop for...of para retornar uma lista com os nomes dos usu;arios que são administradores.*/



function getAdmins(map){
    let admnis = [];
    for ([key, value] of map){
        if (value === 'Admin'){
            admnis.push(key)
        }
    }
    return admnis;
}

const usuarios = new Map();

usuarios.set('Luiz', 'Admin');
usuarios.set('Stefany', 'Admin');
usuarios.set('Jorge', 'User');
usuarios.set('Nathalia', 'Admin');

console.log(getAdmins(usuarios));

