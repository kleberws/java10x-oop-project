package NivelIntermediario.ClassesAbstratas;

public abstract class Hokage {
//    classe abstrata não pode ser instanciada

//        Não tem como instanciar uma classe, um hokage é um tipo de ninja general.
//        usado para evitar que outras pessoas instanciem alguma classe
    String nome;
    int idade;

    public abstract void LiderarAldeia();
//    sujeita a classe concetra filha a usar o metodo

//    objetivo de usar classe abstrata em nível operacional do sistema: escalabilidade, manutenção.

}
