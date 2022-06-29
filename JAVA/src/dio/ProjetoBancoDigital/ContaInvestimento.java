package dio.ProjetoBancoDigital;

public class ContaInvestimento extends Conta {



    public ContaInvestimento(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Investimento *** ");
        super.ImprimirInfosComuns();

    }

    public void Rendimento(double valor){
        double valorRendimento = saldo * valor;
        double valorDepoisRendimento = saldo + valorRendimento;
        System.out.println("Rendimento: " + valorRendimento);
        System.out.println("Saldo Atualizado: " + valorDepoisRendimento);
    }
}
