package NivelIntermediario.ExemploMetodos;

public class Calculadora {
    //METODOS(soma, substração, divisão e multiplicação) FORA DO PSVM
// E E FOSSE VOID, NÃO PRECISARIA DE RETURN

//    SOMA
    int soma(int a, int b){
        return a+b;
    }

//    SUBTRAÇÃO
    int subtracao(int a, int b){
        return a-b;
    }

//    DIVISÃO
    int divisao(int a, int b){
        return a/b;
    }

//    MULTIPLICAÇÃO
    int multiplicacao(int a, int b){
        return a*b;
    }

    public static void main(String Args[]){
//        CRIANDO OBJETO
        Calculadora calc = new Calculadora();

//        CHAMANDO MÉTODOS
        int soma = calc.soma(5, 3);
        int subtracao = calc.subtracao(10, 4);
        int divisao = calc.divisao(20, 5);
        int multiplicacao = calc.multiplicacao(6, 7);

//        CHAMANDO PRINT DOS RESULTADOS
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicação: " + multiplicacao);
    }
}
