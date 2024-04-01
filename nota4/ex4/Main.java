package nota4.ex4;

public class Main {

    public static void main(String[] args) {
        Leao leao = new Leao ("Leão","4 patas", "Juba", "Mamífero");
        Arara arara = new Arara("Arara", "Asas","Penas coloridas","Aves");

        leao.exibirInformacao();
        arara.exibirInformacao();
    }
}
