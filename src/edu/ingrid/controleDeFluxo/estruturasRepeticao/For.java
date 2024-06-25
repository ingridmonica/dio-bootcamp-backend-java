package src.edu.ingrid.controleDeFluxo.estruturasRepeticao;

public class For {
    public static void main (String[] args){
        //estrutura 1
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }
        System.out.println("João dormiu :/");

        //estrutura 2 => o que importa é somente o bloco condicional
        int carneirinhos2 = 1;
        for( ; carneirinhos2 <=20; ) {
            System.out.println(carneirinhos2 + " - Carneirinho(s)");
            carneirinhos2 ++;
        }
        System.out.println("João dormiu :/");

        //for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução )
    }
}
