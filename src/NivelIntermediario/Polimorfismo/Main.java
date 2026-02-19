package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 17;
        naruto.aldeia = "Aldeia da Folha";
        naruto.habilidadeEspecial();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 17;
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.habilidadeEspecial();

    }
}
