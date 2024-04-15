import javax.swing.*;

public class Gato extends Animal implements Movimento {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        JOptionPane.showMessageDialog(null,"Miau Miau!");
    }

    @Override
    public void voando() {

    }

    @Override
    public void correr(){
        JOptionPane.showMessageDialog(null,"Correndo muito rapido miau !");
    }
}
