package dio.LogicaCondicional;

import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;

        System.out.println("Digite o valor: ");
        a = scan.nextInt();
        valores(a);
    }

    public static void valores(int a){
        switch (a){
            case 1, 2, 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido!");
                break;
        }
    }
}

