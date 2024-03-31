package nota3.ex3;
public class Corrente extends Conta {

    private double limiteChequeEspecial;

    public Corrente(String titular, double limiteChequeEspecial) {
        super(titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else if (valor <= (saldo + limiteChequeEspecial)) {
            saldo -= valor;
            limiteChequeEspecial -= (valor - saldo);
        } else {
            System.out.println("Saldo insuficiente e limite do cheque especial excedido!");
        }
    }

    public void usarChequeEspecial(double valor) {
        if (valor <= limiteChequeEspecial) {
            saldo += valor;
            limiteChequeEspecial -= valor;
        } else {
            System.out.println("Limite do cheque especial excedido!");
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("**Conta Corrente**");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite Cheque Especial: R$" + limiteChequeEspecial);
    }
}

