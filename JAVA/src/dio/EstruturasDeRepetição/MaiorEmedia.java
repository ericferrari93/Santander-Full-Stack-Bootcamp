package dio.EstruturasDeRepetição;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class MaiorEmedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double maiornumero = 0;
        double somanumero = 0;
        double media;

        int count = 0;

        do {
            System.out.println("Numero: ");
            double numero = scan.nextDouble();

            if (numero > maiornumero){
                maiornumero = numero;
            }
            somanumero = somanumero + numero;
            count += 1;
        }
        while (count < 5);
            media = somanumero / 5;
            System.out.println("O maior numero: " + maiornumero + " e a media dos numeros somados é: " + media);

    }
}
