package NivelIntermediario.ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
    // NÃO TEM COMO INSTANCIAR UMA CLASSE ABSTRATA
//    Hokage hashirama = new Hokage();

        Senju hashirama = new Senju();
        hashirama.nome = "Hashirama Senju";
        hashirama.idade = 100;
        hashirama.LiderarAldeia();
        System.out.println("Idade: "+ hashirama.idade);
    }
}
