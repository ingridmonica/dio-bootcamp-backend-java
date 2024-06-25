package src.edu.ingrid.controleDeFluxo.estruturasRepeticao;

public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){

            if(numero==3)
                break;

            System.out.println(numero);
        }
        // No terminal:
        // 1
        // 2
        // o Break interrompe o for (quando a condição do if for true)

        System.out.println("Próximo caso");

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;

            // Pula a execução saindo do bloco for e não imprime o 3
            System.out.println(numero);

            // Console:
            // 1
            // 2
            // 4
            // 5
        }
    }
}
