package dio.metodos;

public class emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static double getTaxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){

        if (parcelas == 2){

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final para 2 parcelas e de " + valorFinal);
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor final para 3 parcelas e de " + valorFinal);

        }else {
            System.out.println("Valor de parcela incorreto");
        }


    }


}
