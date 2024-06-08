package src.edu.ingrid.sintaxe.operadores;

public class Operadores {
    public static void main (String [] args){
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);

        String concatenacao ="?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        // concatenação = 31 -> ocorreu a soma dos números e a concatenação com a string "1"
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        // concatenação = 1111 -> ao identificar  a string a soma não ocorre mais
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        // concatenação = 1111
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        // concatenação = 1111
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        // concatenação = 13 -> realiza primeiro a soma das evidências (parênteses) e depois concatena com a string
        System.out.println(concatenacao);

    }
}
