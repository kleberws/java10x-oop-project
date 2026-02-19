package NivelIntermediario.ExemploObjeto;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void DetalhesDoCarro(){
        System.out.println("Detalhes do Carro:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("-------------------------");
    }
}
