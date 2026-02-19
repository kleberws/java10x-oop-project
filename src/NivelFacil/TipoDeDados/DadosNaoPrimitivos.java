package NivelFacil.TipoDeDados;

public class DadosNaoPrimitivos {
    static void main(String[] args) {

//       Dados primitivos: Não conseguem receber métodos por padrão
//       Dados não primitivos: Conseguem receber métodos por padrão/ String, Class, enum


//        Criar um ninja e atribuir métodos a ele.
//        Métodos: Caracteristicas inclusas nos dados.

        String nome = "Naruto Uzumaki";
        String nomeUpperCase= nome.toUpperCase();
        System.out.println(nomeUpperCase);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println(aldeiaLowerCase);
    }
}
