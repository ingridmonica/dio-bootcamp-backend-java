package src.edu.ingrid.controleDeFluxo.estruturasCondicionais;

public class PlanoOperadora {
    // Modo condicional switch/case
    public static void main(String[] args) {
        String plano = "M"; // M / T
        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
        /*
        * Dessa forma como não possui o break, ao organizar nessa ordem ele deve imprimir todos
        * os blocos posteriores a partir do caso correspondente.
        * */
    }
}
