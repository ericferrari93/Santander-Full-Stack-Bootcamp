package dio.EstruturasDeRepetição;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma nota entre 0 e 10: ");
        int nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota Invalida!");
            System.out.println("Tente novamente: ");
            nota = scan.nextInt();
        }
        System.out.println("Nota: " + nota);
    }
}
