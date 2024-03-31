package nota2.ex3;

import javax.swing.*;
import java.util.Objects;

public class Triangulo {
    private Double lado1, lado2, lado3;

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }

    public void tipoTriangulo() {
        if (Objects.equals(lado1, lado2) && Objects.equals(lado1, lado3)) {
            JOptionPane.showMessageDialog(null, "Triangulo : Equilátero");
        } else if (Objects.equals(lado1, lado2) || Objects.equals(lado2, lado3) || Objects.equals(lado1, lado3)) {
            JOptionPane.showMessageDialog(null, "Triangulo : Isósceles");
        } else {
            JOptionPane.showMessageDialog(null, "Triangulo : Escaleno");
        }
    }
}
