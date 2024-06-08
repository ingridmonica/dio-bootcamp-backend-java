package src.edu.ingrid.sintaxe.operadores;

public class ComparacoesAvancadas {
    public static void main (String [] args){
        int numero1 = 1;
        int numero2 = 1;

        if(numero1== 2 & numero2 ++ == 2)
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero1); // numero1= 1
        System.out.println("O numero 2 agora é " + numero2); // numero2= 2

        /* Mudando a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 ) temos:
        * O numero 1 agora é 1
        * O numero 2 agora é 1
        *
        * => visto que com o duplo operador (operador de curto circuito), ao analisar a primeira condição
        * e verificar que ela é falsa, não é feita a comparação da segunda condição e dessa forma o numero2
        * não foi incrementado.
        */

        if(numero1== 2 | numero2 ++ == 2)
            System.out.println("Uma das condições é verdadeira");

        System.out.println("O numero 1 agora é " + numero1); // numero1= 1
        System.out.println("O numero 2 agora é " + numero2); // numero2= 3


        if(numero1== 1 || numero2 ++ == 2)
            System.out.println("Uma das condições é verdadeira, ou as duas são verdadeiras");

        System.out.println("O numero 1 agora é " + numero1); // numero1= 1
        System.out.println("O numero 2 agora é " + numero2); // numero2= 4
        // Como a primeira expressão é true ele não verifica a segunda expressão e não incrementa o numero2 (mas entra no if)


         if(numero1== 2 || numero2 ++ == 2)
             System.out.println("Uma das condições é verdadeira, ou as duas são verdadeiras");

        System.out.println("O numero 1 agora é " + numero1); // numero1= 1
        System.out.println("O numero 2 agora é " + numero2); // numero2 = 4
         // Como a primeira expressão é false ele ainda verifica a segunda e incrementa o numero2
    }
}
