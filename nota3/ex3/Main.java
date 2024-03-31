package nota3.ex3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Corrente cc = new Corrente();
        Poupanca cp = new Poupanca();


        System.out.println("Selecione o tipo de conta:");
        System.out.println("1 Conta Corrente");
        System.out.println("2 Conta Poupança");

        int opcao = scanner.nextInt();

        Conta conta;

        switch (opcao) {
            case 1:

                break;
            case 2:

                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }
    }
}