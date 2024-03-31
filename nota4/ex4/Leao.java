package nota4.ex4;

public class Leao extends Animal{
    public String especie;
    public Leao (String nome, String locomocao, String caracteristica, String especie) {
        super(nome, locomocao, caracteristica);
        this.especie = especie;
    }

    public void exibirInformacao(){
        System.out.println("Animal: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Tipo de locomoção: "+ locomocao);
        System.out.println("Característica: "+ caracteristica);
    }
}
