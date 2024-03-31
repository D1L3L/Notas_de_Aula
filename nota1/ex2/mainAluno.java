package ex2;

import javax.swing.*;

public class mainAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = JOptionPane.showInputDialog("Qual o nome do Aluno: ");
        a.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        a.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        a.nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        System.out.println("Aluno(a):" + a.nome + " ficou com média " + a.notas() + ".");
        if (a.notas()>= 7){
            System.out.println("O aluno "+a.nome+" está aprovado com a média: " + a.notas());
        }
        else if(a.notas() < 4){
            System.out.println("O aluno "+a.nome+" está reprovado com a média: " + a.notas());
        }
        else{
            System.out.println("O aluno "+a.nome+" está na final com a média: " + a.notas());
        }
    }
}
