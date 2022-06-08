package dio.EstruturasDeRepetição;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada de " + numero + ":");

        //para: variável i = 0, até i menor ou igual a 10, adicionando 1 ao valor de i a cada loop.
        for (int i = 0; i <= 10; i = i + 1) {

            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
