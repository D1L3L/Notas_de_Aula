import javax.swing.JOptionPane;
public class Cachorro extends Animal implements Movimento{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        JOptionPane.showMessageDialog(null,"Au Au!!");
    }

    @Override
    public void voando() {

    }
    @Override
    public void correr() {
        JOptionPane.showMessageDialog(null,"Estou correndo muito auuuuuuuuuuuu!");
    }
}