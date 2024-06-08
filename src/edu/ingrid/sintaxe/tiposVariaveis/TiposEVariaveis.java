package src.edu.ingrid.sintaxe.tiposVariaveis;

public class TiposEVariaveis{
    public static void main(String[] args) {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);
    }

    /*
    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = numeroNormal;
    // Nesse caso não funciona pois estamos tentando atribuir um valor de tipo maior (int)
    // a uma variável de tipo menor (short) sem realizar um casting explícito. Para corrigir isso
    // devemos converter explicitamente o int parar um short como no método main acima.
    */
}
