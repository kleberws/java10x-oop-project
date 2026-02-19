package NivelIntermediario.abstracaoEInterface;

public class Uchiha extends Ninja implements Sharingan {
    @Override
    public void habilidadeEspecial(){
        System.out.println(this.nome + " ativou o Sharingan!");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println(this.nome + " é um gênio tático!!");
    }

    @Override
    public void ativarSharingan() {System.out.println(this.nome + " ativou o Sharingan!");}

}
