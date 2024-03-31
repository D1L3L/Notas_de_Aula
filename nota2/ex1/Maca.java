package nota2.ex1;
import javax.swing.*;
public class Maca {
    private double m = 1.30;
    private double quantidade;
    double valor;
    public double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    public void calcularValor(){
        if (quantidade < 12 ){
            valor = m*quantidade;
            System.out.printf("O valor das maçãs foi de  : R$%.2f%n", valor);
        } else if (quantidade>=12) {
            valor = quantidade;
            System.out.printf("O valor das maçãs foi de  : R$%.2f%n", valor);
        }
    }

}