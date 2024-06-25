package src.edu.ingrid.controleDeFluxo.estruturasCondicionais;

public class ResultadoEscolar {
    // Estrutura condicional Composta
    public static void main(String[] args) {
        int nota = 6;

        // Estrutura condicional encadeada (Else If)
        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

        // Operador Ternário
        int nota2 = 7;
        String resultado = nota2 >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        // Ternário com Else if ("Se não se" )
        int nota3 = 6;
        String resultado2 = nota3 >=7 ? "Aprovado" : nota3 >=5 && nota3 <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);
    }
}