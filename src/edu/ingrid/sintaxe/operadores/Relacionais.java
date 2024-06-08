package src.edu.ingrid.sintaxe.operadores;

public class Relacionais {
    public static void main (String [] args){
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;
        System.out.println(nome3 == nome4); //true

        //equals verificando o conteúdo dos objetos (sobre valor e referência)
        System.out.println(nome1.equals(nome2)); //true
        System.out.println(nome2.equals(nome3)); //true
        System.out.println(nome3.equals(nome4)); //true
    }
}
