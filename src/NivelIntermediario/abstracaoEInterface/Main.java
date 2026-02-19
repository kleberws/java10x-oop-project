package NivelIntermediario.abstracaoEInterface;

public class Main {
    public static void main(String[] args) {

//        obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 17;
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.estrategiaDeBatalha();
        sasuke.habilidadeEspecial();

//        obj hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.idade = 48;
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.boasVindas();
        kakashi.ativarSharingan();
        kakashi.ninjaDeElite();
    }
}