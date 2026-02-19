package NivelIntermediario.EstudoAula4;

public class Boruto extends Uzumaki implements HyugaUzumaki{
    //usou implements= tem que usar algo de lá.
    @Override
    public void AtivarOKarma() {
        System.out.println("" + this.nome + " ativou o Karma!");
    }

    @Override
    public void AtivarJougan(){
        System.out.println(this.nome + " ativou o Jogan!");
    }
}