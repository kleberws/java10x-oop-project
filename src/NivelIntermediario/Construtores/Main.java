package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {
       Hokages Hashirama = new Hokages();

       //construtores = 2 tipos:
//        OnArgsConstructor
//        NoArgsConstructor

//        obs: pode ser criado diversas vezes,
//        mas deve ser criado apenas um construtor com parametros e um sem parametros

//        hashirama = construtor com parametros
       Hokages hashirama = new Hokages("Hashirama Senju", 50, false);
        System.out.println("Nome: " + Hashirama.nome);
        System.out.println("Idade: " + Hashirama.idade);
        System.out.println("Ativo: " + Hashirama.ativo);

//        tobirama = construtor sem parametros
        Hokages tobirama = new Hokages();
        tobirama.nome = "Tobirama Senju";
        tobirama.idade = 45;
        tobirama.ativo = false;


    }
}
