package NivelIntermediario.abstracaoEInterface;

public class  Uzumaki extends Ninja{
    @Override
    public void habilidadeEspecial(){
        System.out.println(this.nome + " ativou o Rasengan!");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println(this.nome + " nunca desiste!!");
    }
}
