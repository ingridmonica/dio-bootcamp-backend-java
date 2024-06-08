package src.edu.ingrid.sintaxe.anatomiaClasses;

public class Metodos {

    public static void main (String [] args) {
        String primeiroNome = "Ingrid";
        String segundoNome = "Mônica";
        String nomeCompleto = concatenarNome(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String concatenarNome (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
