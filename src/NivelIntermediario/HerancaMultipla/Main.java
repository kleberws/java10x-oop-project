package NivelIntermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        AtivarSharingan sharingan = new AtivarSharingan(){
            @Override
            public void ativarSharingan() {
                System.out.println("Sharingan ativado!");
            }
        };

        Hatake kakashi = new Hatake(sharingan);
        kakashi.nome = "Kakashi";
        kakashi.idade = 48;
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.verificarSharingan();

        Uchiha sasuke = new Uchiha(sharingan);
        sasuke.nome = "Sasuke";
        sasuke.idade = 17;
        sasuke.aldeia = "Aldeia da Folha";
    }
}
