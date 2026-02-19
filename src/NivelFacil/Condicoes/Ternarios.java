package NivelFacil.Condicoes;

public class Ternarios {
    public static void main(String Args[]) {
//variavel = *condição* ? valor se verdadeiro : valor se falso;
        int idade = 15;
        idade = (idade>=18) ? 1 : 0;
        System.out.println(idade);
//       saída 1 = true
//       saída 0 = false

        String nivel = (idade>=18) ? "Maior de idade" : "Menor de idade";
        System.out.println(nivel);
//    criei variavel nivel como String p/ msg

        String aula =  "boa";
        String qualidade = (aula=="boa") ? "Aula das braba" : "Aulas não das braba";
        System.out.println(qualidade);
    }
}
