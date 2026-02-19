package NivelIntermediario.abstracaoEInterface;

public class Hatake extends Ninja implements AnbuInterface, Sharingan, HokageAtivo{
    public void boasVindas(){
        System.out.println(nome + ": Eu sou um Hatake");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Eu sou um Hatake, e minha estratégia é ser imprevisível!!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(this.nome + " ativou o Kamui!");
    }

    @Override
    public void ativarSharingan() {
        System.out.println(this.nome + " ativou o Sharingan!");
    }

    @Override
    public void ninjaDeElite(){
        System.out.println(this.nome + " é um membro da Anbu!");
    }

    @Override
    public void HokageAtivo() {
        System.out.println(this.nome + " é o Hokage ativo!");
    }
}
