package dio.EstruturasDeRepetição;

import java.util.Scanner;

public class parEimpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de numeros: ");
        int quantnumero = scan.nextInt();

        int quantpar = 0, quantimpar = 0;

        int count = 0;


        do {
            System.out.println("Numero: ");
            int numero = scan.nextInt();

            if (numero % 2 == 0) quantpar++;
            else {
                quantimpar++;
            }
            count++;
        }while (count < quantnumero);

        System.out.println("Quantidade de numeros pares: " + quantpar + " / Quantidade numeros impares: " + quantimpar);



    }
}
