package NivelIntermediario.HerancaMultipla;

public class Uchiha extends Ninja implements AtivarSharingan {
    private AtivarSharingan sharingan;
    public Uchiha(AtivarSharingan sharingan) {
            this.sharingan = sharingan;
    }

    public void VerificarSharingan(){
        if (sharingan == null){
            System.out.println("Uchiha não tem Sharingan!");

        }else{
            sharingan.ativarSharingan();
        }
    }

    @Override
    public void ativarSharingan()    {
        System.out.println("O Sharingan de um Uchiha foi ativado!");
    }

}
