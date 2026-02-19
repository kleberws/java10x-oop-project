package NivelIntermediario.EstudoAula4;
import java.util.Scanner;

//         POO - PROGRAMAÇÃO ORIENTADA A OBJETOS
//         TUDO COMEÇA COM UMA CLASSE/OBJETOS, QUE TEM ATRIBUTOS(variaveis) E MÉTODOS PRÓPRIOS(funções).
//         TEM 3 PILARES DO POO-> HERANÇA(classe mae), POLIMORFISMO(diversass formas de executar um metodo) E ENCAPSULAMENTO(escopo).
//         Foco aqui é usar todos os pilares.

public class Main {
    public static void main(String Args[]){
        Scanner leitor = new Scanner(System.in);

//        NARUTO
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.RasenganAtivado();


//        SASUKE
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.SharinganAtivado();

//        SAKURA
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 16;
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.AtivarCura();

//         HINATA
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 17;
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.ByakuganAtivado();

//        BORUTO
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.idade = 12;
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();
    }
}