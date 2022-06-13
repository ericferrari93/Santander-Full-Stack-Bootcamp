package dio.ProjetoBancoDigital;

public class Main {
    public static void main(String[] args) {

        Cliente eric = new Cliente();
        eric.setNome("Eric");

        Conta ci = new ContaInvestimento(eric);
        ci.depositar(100);
        ci.imprimirExtrato();
        ci.Rendimento(0.05);





        //Conta cc = new ContaCorrente(eric);
        //Conta cpoupanca = new ContaPoupança(eric);
        //cc.depositar(100);
        //cc.transferir(100, cpoupanca);

        //cc.imprimirExtrato();
        //cpoupanca.imprimirExtrato();


    }
}
