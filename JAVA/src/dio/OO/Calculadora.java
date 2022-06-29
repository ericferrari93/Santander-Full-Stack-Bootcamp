package dio.OO;

public class Calculadora implements OperacoesMatematicas {


    @Override
    public void soma(double operador1, double operador2) {
        System.out.println("Soma: " + operador1 + operador2);
    }

    @Override
    public void subtracao(double operador1, double operador2) {
        System.out.println("Subtracao: " + (operador1 - operador2));
    }

    @Override
    public void multiplicacao(double operador1, double operador2) {
        System.out.println("Multiplicacao: " + operador1 * operador2);
    }

    @Override
    public void divisao(double operador1, double operador2) {
        System.out.println("Dvisao: " + operador1 / operador2);
    }

}
