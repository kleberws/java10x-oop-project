package NivelFacil.Condicoes;

import java.util.Scanner;

public class SwitchCases {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = leitor.nextInt();

        System.out.println("01 - Naruto");
        System.out.println("02 - Sasuke");
        System.out.println("03 - Sakura");

        switch (numero){
            case 1:
                System.out.println("Você escolheu o Naruto!");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke!");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura!");
                break;
            default:
                System.out.println("Número inválido!");
        }
    }
}
