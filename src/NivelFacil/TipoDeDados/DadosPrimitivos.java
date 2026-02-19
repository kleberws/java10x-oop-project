package NivelFacil.TipoDeDados;

import java.util.Scanner;

public class DadosPrimitivos {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        * Dados primitivos - int, double, float, char, boolean, short.
        * Objetivo da aula: Criar um ninja - Naruto
        */

        int idade = 16;
        double altura = 1.64;
        char inicial = 'N';
        boolean VivoOuNão = true;
        Long saldoBancario = 99999L;

        System.out.print("Idade:" + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Saldo: " + saldoBancario);
        System.out.print("Inicial:" + inicial);


    }
}
