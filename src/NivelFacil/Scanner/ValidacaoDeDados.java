package NivelFacil.Scanner;
import java.util.Scanner;
public class ValidacaoDeDados {

    public static void main(String Args[]) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");

        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else {
            System.out.println("Você é maior de idade.");
        }
        leitor.close();

        switch (nome){
            case "Naruto":
                System.out.println("Olá Naruto, bem-vindo de volta!");
                break;
            case "Sasuke":
                System.out.println("Olá Sasuke, que bom te ver!");
                break;
            default:
                System.out.println("Olá " + nome + ", prazer em conhecê-lo!");
        }
    }
}
