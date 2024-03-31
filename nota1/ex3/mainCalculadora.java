package ex3;
import javax.swing.*;

public class mainCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        int i, resposta, n1, n2;

        do {
            resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1: Adição 2:Subtração 3: Divisão 4: Multiplicação"));
            switch (resposta) {
                case 1:
                    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número:"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número:"));
                    JOptionPane.showMessageDialog(null, c.somar(n1, n2));
                    break;
                case 2:
                    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número:"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número:"));
                    JOptionPane.showMessageDialog(null, c.subtracao(n1, n2));
                    break;
                case 3:
                    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número:"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número:"));
                    JOptionPane.showMessageDialog(null, c.divisao(n1, n2));
                    break;
                case 4:
                    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número:"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número:"));
                    JOptionPane.showMessageDialog(null, c.multiplicacao(n1, n2));
                    break;
                default:
                    break;
            }

            i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 0 para continuar, ou outro valor para sair."));
        }while (i==0);

    }
}
