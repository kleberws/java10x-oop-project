package NivelIntermediario.DesafiosAula.Desafio2;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 17, "Rasengan", "Clones de Sombra");
        naruto.mostrarInterface();
        naruto.executarHabilidade();
        System.out.println("Tipo de habilidade: "+NinjaAvançado.TipoNinja.TAIJUTSU.name());
    }
}
