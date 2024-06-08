package src.edu.ingrid.sintaxe.operadores;

public class Unarios {
    public static void main(String [] args) {
        //classe Operadores.java
        int numero = 5;

        //Imprimindo o numero negativo
        System.out.println(-numero);
        numero = -numero; // deixando o valor da string "numero" de fato negativo
        numero = numero * -1; // tornando o número positivo novamente

        //incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops, incremento occorre apenas após o numero ser impresso
        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++numero); // aqui o incremento é feito primeiro, dessa forma o número impresso já está atualizado (6)

        // decrementando funciona da mesma forma
        System.out.println( numero -- ); // só decrementa após o número ser impresso
        System.out.println( numero ); // o valor da variável foi atualizado para 7

        boolean verdadeiro = true;
        System.out.println("Inverteu com o print: " + !verdadeiro); //  aqui não invertemos o valor de fato
        System.out.println("O valor atual da variável é: " + verdadeiro);

        verdadeiro = !verdadeiro; // aqui de fato atribuimos a variável o novo valor
        System.out.println("O valor da variável que foi reatribuída é: " + verdadeiro);
    }
}
