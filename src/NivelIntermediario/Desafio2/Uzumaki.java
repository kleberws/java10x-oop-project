package NivelIntermediario.Desafio2;

public class Uzumaki extends NinjaAvançado implements Ninja {
    public Uzumaki(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;

         enum TipoNinja {
            TAIJUTSU,
            NINJUTSU,
            GENJUTSU,
            OUTROS
        }



    }
}
