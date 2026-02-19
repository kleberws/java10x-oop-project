package NivelFacil.Condicoes;

public class IFeELSE {
    static void main(String[] args) {
        String nome;
        int idade;
        boolean hokage = false;
        int numeroDeMicoes = 14;
        String rank;

//        Objetivo: Passar o ninja de nivel conforme o numero de missoes


        if (numeroDeMicoes >= 20){
            rank = "Hokague";
        }
        else if (numeroDeMicoes > 10 && numeroDeMicoes < 20) {
            rank = "Chunnin";
        }else{
            rank = "Gennin";
        }
        System.out.println("Naruto está no nível de " + rank);

    }
}
