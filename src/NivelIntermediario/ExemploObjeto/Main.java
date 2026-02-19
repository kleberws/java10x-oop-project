package NivelIntermediario.ExemploObjeto;

public class Main {
    public static void main(String Args[]){
        Carro peugeot = new Carro();
        peugeot.modelo = "Peugeot 208";
        peugeot.ano = 2020;
        peugeot.cor = "Prata";

        Carro Porsche = new Carro();
        Porsche.modelo = "Porsche 911";
        Porsche.ano = 2022;
        Porsche.cor = "Vermelho";

        peugeot.DetalhesDoCarro();
        Porsche.DetalhesDoCarro();
    }
}
