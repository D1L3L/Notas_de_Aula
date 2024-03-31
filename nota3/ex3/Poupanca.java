package nota3.ex3;

public class Poupanca extends Conta {

    private double taxaRendimento;

    public Poupanca(String titular, double taxaRendimento) {
        super(titular);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void calcularRendimento() {
        saldo += saldo * taxaRendimento;
    }

    @Override
    public void exibirDados() {
        System.out.println("**Conta Poupança**");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Taxa de Rendimento: " + taxaRendimento + "%");
    }
}


