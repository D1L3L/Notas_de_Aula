package ex1;

import ex1.Funcionario;

import java.util.Scanner;
public class mainFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("matricula");
        f.setMatricula(sc.nextInt());
        System.out.println("nome");
        f.setNome(sc.next());
        System.out.println("Salário");
        f.setBruto(sc.nextDouble());
        System.out.println("Nome do funcionário:"+ f.getNome());
        System.out.printf("Salário Bruto:  R$%.2f%n", f.getBruto());
        System.out.printf("A dedução total foi de R$%.2f%n", f.deducao());
        System.out.printf("O salário líquido ficou de R$%.2f%n", f.liquido());
    }
}
