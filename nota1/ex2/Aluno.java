package ex2;
public class Aluno {
    String nome; double nota1; double nota2; double nota3;
    public double notas() {
        double media = ((nota1 + nota2 + nota3)/3);
        return media;
        }
    }
