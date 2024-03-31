package nota2.ex3;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.setLado1((Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o tamanho do lado 1."))));
        t.setLado2((Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o tamanho do lado 2."))));
        t.setLado3((Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o tamanho do lado 3."))));
        t.tipoTriangulo();
    }
}
