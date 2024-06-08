package src.edu.ingrid.sintaxe.anatomiaClasses;

public class Variaveis {
    int idade = 19;
    double altura = 1.70;
    String nome = "Ingrid";
    boolean dev = true;

    public static void main(String[] args) {
        Variaveis objeto = new Variaveis(); // Cria uma instância da classe Variáveis

        System.out.println("Meu nome é " + objeto.nome + ", tenho " + objeto.idade + " anos e minha altura é " +
                objeto.altura + ". Tenho uma variável booleana que diz se sou dev, e a resposta é: " + objeto.dev + "! :)");
    }
}
