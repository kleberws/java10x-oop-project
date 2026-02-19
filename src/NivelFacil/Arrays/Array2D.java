package NivelFacil.Arrays;

public class Array2D {
    public static void main(String Args[]){
        String[] ninjas = new String[3];
        ninjas[0] = "Narutão Sinistro";
        ninjas[1] = "Sasukinho Maroto";
        ninjas[2] = "Sakurinha Haruno";

        System.out.println(ninjas);
//        retorna [Ljava.lang.String;@27716f4, onde @... é o eslote de memoria

        System.out.println(ninjas[0]);
//        retorna Narutão Sinistro/INDEX

        String[][] timeDoNaruto = new String[2][3];
        // sempre lembrar dos numeros + 1, pq começa do 0.
        timeDoNaruto[0][0] = "Narutão Sinistro";
        timeDoNaruto[0][1] = "ninja random";
        timeDoNaruto[0][2] = "ninja random 2";

        timeDoNaruto[1][0] = "Sasukinho Maroto";
        timeDoNaruto[1][1] = "ninja random 3";
        timeDoNaruto[1][2] = "Sakurinha Haruno";

        timeDoNaruto[2][0] = "Kakashi Hatake";
        timeDoNaruto[2][1] = "ninja random 4";
        timeDoNaruto[2][2] = "ninja random 5";
    }
}
