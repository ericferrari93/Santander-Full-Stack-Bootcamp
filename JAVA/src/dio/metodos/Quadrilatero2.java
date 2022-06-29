package dio.metodos;

public class Quadrilatero2 {

    public static double area(double lado){
        double resultado = lado * lado;
        return resultado;
    }

    public static double area(double lado1, double lado2){
        double resultado = lado1 * lado2;
        return resultado;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        double resultado = (((baseMaior + baseMenor)* altura) / 2);
        return resultado;

    }

    public static float area(float diagonal1, float diagonal2){
        float resultado = ((diagonal1 * diagonal2) / 2);
        return resultado;
    }
}
