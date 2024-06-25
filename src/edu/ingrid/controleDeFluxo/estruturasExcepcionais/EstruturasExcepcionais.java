package src.edu.ingrid.controleDeFluxo.estruturasExcepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class EstruturasExcepcionais {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();

        // No catch informamos a exceção esperada (para ser capturada) e a sua tratativa
        } catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos. \n Ex.: idade -> 19 \n     altura -> '1.75'");

            // poderia ser com 'err' mas não é tão comum:
            System.err.println("Os campos idade e altura precisam ser numéricos. \n Ex.: idade -> 19 \n     altura -> '1.75'");
        }
    }
}
