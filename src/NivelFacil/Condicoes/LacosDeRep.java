package NivelFacil.Condicoes;

public class LacosDeRep {
    public static void main(String[] Args) {
            //while (enquanto a condição for vdd) {tudo aq vai acontecer}
            int NumeroDeClones = 0;
            int NumeroMaxDeClones = 40;
            while (NumeroDeClones <= NumeroMaxDeClones){
                NumeroDeClones++;
                System.out.println("Clone criado!");
            }


//            for (inicialização; condição; incremento) {tudo aq vai acontecer}
        for (int i = 0; i < NumeroMaxDeClones; i++) {
            System.out.println("Clone Criado!");
        }

        for(int i = 0; i < 100; i+=10){
            System.out.println("Kunai Lançada!");
        }
        }
    }
