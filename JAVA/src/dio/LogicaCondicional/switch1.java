package dio.LogicaCondicional;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a;

        System.out.println("Digite o dia da semana: ");
        a = scan.nextLine();
        diaSemana(a);
    }

    public static void diaSemana(String a){

        switch(a){
            case "Domingo":
                System.out.println("1 dia");
                break;
            case "Segunda":
                System.out.println("2 dia");
                break;
            case "Terça":
                System.out.println("3 dia");
                break;
            case "Quarta":
                System.out.println("4 dia");
                break;
            case "Quinta":
                System.out.println("5 dia");
                break;
            case "Sexta":
                System.out.println("6 dia");
                break;
            case "Sabado":
                System.out.println("7 dia");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }


    }






}
