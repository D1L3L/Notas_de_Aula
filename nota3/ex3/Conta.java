package nota3.ex3;

public abstract class Conta {

    protected String titular;
    protected double saldo;

    public Conta(String titular) {
        this.titular = "João Silva";
        this.saldo = 0.0;
    }

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);

    public abstract void exibirDados();

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
