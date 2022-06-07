package teste;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        double a,b;

        System.out.println("Digite um numero: ");
        a = scan.nextDouble();
        System.out.println("Digite um numero: ");
        b = scan.nextDouble();
        double divisao = divisao(a, b);
        double somar = somar(a, b);
        double subtracao = subtracao(a, b);
        double multiplicacao = multiplicacao(a, b);
        System.out.println("A divisao dos dois valores e " + divisao);
        System.out.println("A soma dos dois valores e " + somar);
        System.out.println("A subtracao dos dois valores e " + subtracao);
        System.out.println("A multiplicacao dos dois valores e " + multiplicacao);
    }

    public static double divisao(double a, double b) {
        return a / b;
    }
    public static double somar(double a, double b) {
        return a + b;
    }
    public static double subtracao(double a, double b) {
        return a - b;
    }
    public static double multiplicacao(double a, double b) {
        return a * b;
    }



}

