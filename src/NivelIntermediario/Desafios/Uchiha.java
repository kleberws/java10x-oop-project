package NivelIntermediario.Desafios;

public class Uchiha extends Ninja{
    String habilidadeEspecial;


    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Missão: " + this.missao);
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}
