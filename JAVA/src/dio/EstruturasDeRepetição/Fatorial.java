package dio.EstruturasDeRepetição;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número: ");
        int numero = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(numero + "!=");

            for(int i = numero; i > 0; i--) {
                multiplicacao *= i;

                if (i != 1) {
                    System.out.print(i + ".");
                } else {

                    System.out.print(i + "=" + (multiplicacao));
                }
            }
        }
}
