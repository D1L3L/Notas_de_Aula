package nota4.ex2;

public class Produto {
    public String tipo;
    public String descricao;
    public double preco;
    public Produto(String tipo, String descricao, double preco) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Produto " +
                "tipo=" + tipo + '\'' +
                ", descricao=" + descricao + '\'' +
                ", preco = " + preco;
    }
}