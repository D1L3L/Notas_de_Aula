package nota4.ex1;

public class Main {

    public static void main(String[] args) {
        Professor professor = new Professor("João Silva", 45, 5000.0);
        Aluno aluno = new Aluno("Bruno Oliveira", 20, "123456");

        System.out.println("Professor");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Idade: " + professor.getIdade());
        System.out.println("Salário: R$" + professor.getSalario());

        System.out.println("Aluno");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}
