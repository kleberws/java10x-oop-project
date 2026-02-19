package NivelIntermediario.Desafio2;

public class NinjaAvançado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String especialidade;

    @Override
    public void mostrarInterface() {
        System.out.println("Interface do Ninja Avançado: \n-"+ "Nome: "+ nome + "\n-idade: "+ idade+"\n-habilidade: "+ habilidade + "\n-especialidade: "+ especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("O Ninja Avançado executou a habilidade " +habilidade);
        System.out.println("A sua especialidade é " + especialidade+"!");
    }

    public enum TipoNinja {
        TAIJUTSU,
        NINJUTSU,
        GENJUTSU,
        OUTROS
    }


}
