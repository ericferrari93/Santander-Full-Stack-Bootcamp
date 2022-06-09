package dio.EstruturasDeRepetição.ListaExercicios;

/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';*/

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println();


        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;


        do {
            System.out.print("Digite seu nome: ");
            nome = scan.next();
            if (nome.length() <= 3){
                System.out.println("Nome com poucos caracteres, digite novamente");
            }
        }while (nome.length() <= 3);

        do {
            System.out.print("Digite sua idade: ");
            idade = scan.nextInt();
            if (idade < 0 || idade > 150){
                System.out.println("Idade nao permitida, digite novamente");
            }
        }while (idade < 0 || idade > 150);

        do {
            System.out.print("Digite seu salario: ");
            salario = scan.nextDouble();
            if (salario < 0 ){
                System.out.println("Salario invalido, digite novamente");
            }
        }while (salario < 0);

        do {
            System.out.print("Sexo: ");
            sexo = scan.next();
            if (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")){
                System.out.println("Genero invalido, digite novamente");
            }
        }while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));

        do {
            System.out.print("Estado Civil: ");
            estadoCivil = scan.next();
            if (!(estadoCivil.equalsIgnoreCase("s")|
                estadoCivil.equalsIgnoreCase("c")|
                estadoCivil.equalsIgnoreCase("v")|
                estadoCivil.equalsIgnoreCase("d"))){
                System.out.println("Estadio Civil invalido, digite novamente");
            }
        }while (!(estadoCivil.equalsIgnoreCase("s")|
                estadoCivil.equalsIgnoreCase("c")|
                estadoCivil.equalsIgnoreCase("v")|
                estadoCivil.equalsIgnoreCase("d")));

        System.out.println("Nome: " + nome + " Idade: " + idade + " Salario: " + salario
                + " Genero: " + sexo + " Estado Civil: " + estadoCivil);
    }


}
