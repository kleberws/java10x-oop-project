package NivelIntermediario.abstracaoEInterface;

//abstrato = não pode ser instanciado diretamente
//abstrato = escalabilidade e manutenção(por exigir um  padrão)

//classe abstrata para seguir um padrão
public abstract class Ninja implements Estrategia {
    String nome;
    int idade;
    String aldeia;

    public void habilidadeEspecial() {
        System.out.println("Habilidade especial do ninja: " + nome);
    }

}