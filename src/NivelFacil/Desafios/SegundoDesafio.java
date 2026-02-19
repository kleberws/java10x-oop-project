package NivelFacil.Desafios;
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Criando Array para armazenar os ninjas cadastrados do desafio da aula.
        int NumeroMAX = 10;
        String[] ninjas = new String[NumeroMAX];
        int[] idades = new int[NumeroMAX];
        int contadorNinjas = 0;
        int opcao = 0;

        while(opcao != 3){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine(); // consome o ENTER deixado por nextInt()

            switch(opcao){
                case 1:
                    if (contadorNinjas < NumeroMAX) {
                        System.out.println("Digite o nome do ninja:");
                        String nomeNinja = input.nextLine(); // permite nomes com espaços
                        System.out.println("Digite a idade do ninja:");
                        int idadeNinja = input.nextInt();
                        input.nextLine(); // consome o ENTER deixado por nextInt()

                        ninjas[contadorNinjas] = nomeNinja;
                        idades[contadorNinjas] = idadeNinja;
                        contadorNinjas++;

                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de ninjas atingido.");
                    }
                    break;
                case 2:
                    System.out.println("Lista de Ninjas Cadastrados:");
                    if (contadorNinjas == 0) {
                        System.out.println("Nenhum ninja cadastrado ainda.");
                    } else {
                        for(int i = 0 ; i < contadorNinjas ; i++){
                            System.out.println((i+1) + ": " + ninjas[i] + " - " + idades[i] + " anos");
                        }System.out.println("Há ainda disponivel " + (NumeroMAX - contadorNinjas) + " vagas para novos ninjas.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        input.close();
    }
}
