package NivelFacil.Arrays;

public class Array {
    public static void main(String[] Args){
        /*
        String ninja1 = "Narutão Sinistro";
        String ninja2 = "Sasukinho Maroto";
        String ninja3 = "Sakurinha Haruno";
         */

//        Arrays = Estrutura de Dados que armazena uma quantidade grande de variavéis
//        É um tipo de dado que comunica antes quantos espaços terá;
        String[] ninja = new String[3];  //criado Array String com 3 ninjas
//        cria 3 espaços na memoria(conforme aula de memoria java)



        ninja[0] = "Narutão Sinistro"; //index começa em zero.
        ninja[1] = "Sasukinho Maroto";
        ninja[2] = "Sakurinha Haruno";


//        é possivel redefinir os valores das variavéis depois de criadas;
//        apena colocar (sem String) ninja[x] = "nome do novo ninja";

        for(int i = 0 ; ninja.length > i ; i++){
            System.out.println(ninja[i]);
        }
    }
}
