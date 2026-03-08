package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements AtivarSharingan, AnbuAtivo {

    private AtivarSharingan sharingan;
    public Hatake(AtivarSharingan sharingan) {
        this.sharingan = sharingan;
    }

    public void BoasVindas(){
        System.out.println("nome:" + nome + ", eu sou um Hatake!");
    }


    public void verificarSharingan(){
        if(sharingan == null){
            System.out.println("Hatake não tem Sharingan!");
        }else{
            sharingan.ativarSharingan();
        }
    }

    @Override
    public void bemVindoAnbu() {
        System.out.println("Eu sou um membro da Anbu!");
    }

    @Override
    public void ativarSharingan(){
        System.out.println("O Sharingan de um Hatake foi ativado!");
    }

}
