package dio.ProjetoBancoDigital;

public abstract class Conta implements iConta {

    private static int sequencial = 1;
    private static final int agencia_padrao = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;



    public Conta(Cliente cliente) {
        this.agencia = Conta.agencia_padrao;
        this.numero = sequencial++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void ImprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    protected void ImprimirInfosComRendimento() {

    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contadestino) {
        this.sacar(valor);
        contadestino.depositar(valor);
    }

    public void Rendimento(double valor) {


    }
}
