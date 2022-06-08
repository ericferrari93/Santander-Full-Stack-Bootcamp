package dio.metodos;

public class executar {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio calculadora");
        calculadora1.soma(5, 2);
        calculadora1.subtracao(5, 2);
        calculadora1.multiplicacao(5, 2);
        calculadora1.divisao(5, 2);

        //Mensagem
        System.out.println("Exercio de mensagem");
        mensagem.obterMensagem(6);
        mensagem.obterMensagem(14);
        mensagem.obterMensagem(21);

        //Emprestimo
        System.out.println("Exercicio de Emprestimo");
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 5);

        // Quadrilátero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

        //Quadrilátero2
        System.out.println("Exercício quadrilatero2");
        System.out.println("Area do Quadrado: " + Quadrilatero2.area(3));
        System.out.println("Area do retangulo: " + Quadrilatero2.area(5d,5d));
        System.out.println("Area do trapezio: " + Quadrilatero2.area(7,8,9));
        System.out.println("Area do losango: " + Quadrilatero2.area(5f,5f));

    }

}
