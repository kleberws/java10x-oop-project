package NivelFacil.Desafios;

//Este exercicio tem somente o objetivo de testar a sintaxe do java
//
//    COMO NÃO CHEGUEI NA PARTE DE FUNÇÃO, FOI PRECISO CÓPIAR O MEMOS CÓDIGO, PORÉM,
//    ESTE TÓPICO SERÁ EXERCITADO FUTURAMENTE NO DECCORER DO CURSO
//

public class PrimeiroDesafio {
    static void main(String[] args) {

        String status1;
        String status2;
        String status3;

//        NARUTO
        String nome = "Naruto Uzumaki";
        int idade = 19;
        String missaoAtribuida1 = "Treinar com Jiraya";
        char dificuldade1 = 'b';
        boolean finalizada;

        if (idade < 15) {
            if (dificuldade1 == 'c' || dificuldade1 == 'd') {
                System.out.println("Missão conclúida");
                finalizada = true;
            } else {
                System.out.println("Não há idade suficiente");
                finalizada = false;
            }
        } else {
            System.out.println("Missão finalizada");
            finalizada = true;
        }
        if (finalizada == true) {
            status1 = "Concluído";
        } else {
            status1 = "Não concluída";
        }

        System.out.println("--------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Status: " + missaoAtribuida1 + ": " + status1);


//        SASUKE
        String nome2 = "Sasuke Uchiha";
        int idade2 = 20;
        String missaoAtribuida2 = "Invadir a Vila da Areia";
        char dificuldade2 = 'c';
        boolean finalizada2;

        if (idade2 < 15) {
            if (dificuldade2 == 'c' || dificuldade2 == 'd') {
                System.out.println("Missão conclúida");
                finalizada2 = true;
            } else {
                System.out.println("Não há idade suficiente");
                finalizada2 = false;
            }
        } else {
            System.out.println("Missão finalizada");
            finalizada2 = true;
        }
        if (finalizada2 == true) {
            status2 = "Concluído";
        } else {
            status2 = "Não concluída";
        }

        System.out.println("--------");
        System.out.println("Nome: " + nome2);
        System.out.println("Idade: " + idade2);
        System.out.println("Status: " + missaoAtribuida2 + ": " + status2);

//        SAKURA
        String nome3 = "Sakura";
        int idade3 = 19;
        String missaoAtribuida3 = "Curar os feridos";
        char dificuldade3 = 'd';
        boolean finalizada3;

        if (idade3 < 15) {
            if (dificuldade3 == 'c' || dificuldade3 == 'd') {
                System.out.println("Missão conclúida");
                finalizada3 = true;
            }else {
                System.out.println("Não há idade suficiente");
                finalizada3 = false;
            }
        }else {
            System.out.println("Missão finalizada");
            finalizada3 = true;
        }
        if (finalizada3 == true) {
            status3 = "Concluído";
        } else {
            status3 = "Não concluída";
            }
        System.out.println("--------");
        System.out.println("Nome: " + nome3);
        System.out.println("Idade: " + idade3);
        System.out.println("Status: " + missaoAtribuida3 + ": " + status3);
        }
}




