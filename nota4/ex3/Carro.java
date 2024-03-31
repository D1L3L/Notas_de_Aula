package nota4.ex3;

public class Carro {
    public String marca, modelo;
    public int ano;



    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void mostrarDetalhes(){
        System.out.println("Ficha técnica:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
