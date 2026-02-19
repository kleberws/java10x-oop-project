package NivelIntermediario.Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ninja {
    String nome;
    int idade;
    String missao;
    static String habilidadeEspecial;
    static Scanner input = new Scanner(System.in);

    public void MostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Missão: " + this.missao);
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    static ArrayList<Ninja> listaNinja = new ArrayList <Ninja>();
    static ArrayList<Uchiha> listaUchiha = new ArrayList <Uchiha>();

    public static void cadastrarNinjas(){
        System.out.println("O ninja é um Uchiha? (s/n)");
        String respostas = input.nextLine();
        if (respostas.equalsIgnoreCase("s")) {
            System.out.println("Digite o nome do Uchiha:");
            String nomeUchiha = input.nextLine();
            Uchiha uchiha = new Uchiha();
            uchiha.nome = nomeUchiha;
            System.out.println("Digite a idade do Uchiha:");
            uchiha.idade = input.nextInt();
            input.nextLine(); // Consumir a quebra de linha
            System.out.println("Digite a missão do Uchiha:");
            uchiha.missao = input.nextLine();
            System.out.println("Digite a habilidade especial do Uchiha:");
            uchiha.habilidadeEspecial = input.nextLine();
            System.out.println("Uchiha cadastrado com sucesso!");
            listaUchiha.add(uchiha);
            System.out.println("Lista Uchiha(size) :"+listaUchiha.size());
        }else{
            System.out.println("Digite o nome do ninja: ");
            String nomeNinja = input.nextLine();
            Ninja ninja = new Ninja();
            ninja.nome = nomeNinja;
            System.out.println("Digite a idade do ninja:");
            ninja.idade = input.nextInt();
            input.nextLine(); // Consumir a quebra de linha
            System.out.println("Digite a missão do ninja:");
            ninja.missao = input.nextLine();
            System.out.println("Qual seria sua habilidade especial?");
            String habilidadeNinja = input.nextLine();
            System.out.println("Ninja cadastrado com sucesso!");
            listaNinja.add(ninja);
            System.out.println("Lista Ninja(size) :"+listaNinja.size());
        }
    }

public static void main(String[] Args) {
    int opcao = 0;
    System.out.println("Bem-vindo ao sistema de gerenciamento de ninjas!");
    System.out.println("Ecolha uma das opções abaixo:");
    System.out.println("");

    while (opcao != 4) {
        System.out.println("----- Menu de Opções -----");
        System.out.println("01. Exibir informações de todos os ninjas");
        System.out.println("02. Adicionar novos ninjas");
        System.out.println("03. Atualizar habilidade especial de um Uchiha");
        System.out.println("04. Sair");
        System.out.println("Opção: ");
        opcao = input.nextInt();
        input.nextLine();
        switch (opcao) {
            case 1:
                // Lógica para exibir informações de todos os ninjas
                System.out.println("----- Exibir Informações de Todos os Ninjas -----");
                System.out.println("Exibindo informações de todos os ninjas...");
                System.out.println("Lista Ninja(size) : " + listaNinja.size());
                System.out.println("Lista Uchiha(size) : " + listaUchiha.size());
                if (listaUchiha.size() > 0 && listaNinja.size() > 0) {
                    System.out.println("----- Ninjas Cadastrados -----");
                    for (Ninja ninja : listaNinja) {
                        ninja.MostrarInformacoes();
                    }
                    System.out.println("-----------------------");
                    for (Uchiha uchiha : listaUchiha) {
                        uchiha.mostrarInformacoes();
                    }
                }
                break;
            case 2:
                System.out.println("----- Adicionar Novos Ninjas -----");
                cadastrarNinjas();
                break;
            case 3:
                System.out.println("----- Atualizar Habilidade Especial de um Uchiha -----");
                System.out.println("O Ninja é um Uchiha? (s/n)");
                String resposta = input.nextLine();
                if (resposta.equalsIgnoreCase("s")) {
                    System.out.println("Digite o nome do Uchiha que deseja atualizar a habilidade especial:");
                    String nomeUchiha = input.nextLine();
                    boolean encontrado = false;
                    for (Uchiha uchiha : listaUchiha) {
                        if (uchiha.nome.equalsIgnoreCase(nomeUchiha)) {
                            System.out.println("Digite a nova habilidade especial:");
                            String novaHabilidade = input.nextLine();
                            uchiha.habilidadeEspecial = novaHabilidade;
                            System.out.println("Habilidade especial atualizada com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Uchiha não encontrado.");
                    }
                } else {
                    System.out.println("Digite qual o nome do Ninja que deseja atualizar a habilidade especial:");
                    String novaHabilidade = input.nextLine();
                    habilidadeEspecial = novaHabilidade;

                }
                break;
            case 4:
                System.out.println("Saindo do sistema. Até mais!");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
        }
    input.close();
}
}
