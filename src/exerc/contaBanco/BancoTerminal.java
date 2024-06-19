package src.exerc.contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class BancoTerminal {
    public static void main (String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Nome: ");
        String nomeCliente = entrada.next();

        System.out.println("Agência: ");
        String agencia = entrada.next();

        System.out.println("Nº da conta: ");
        int numConta = entrada.nextInt();

        System.out.println("Saldo: ");
        double saldo = entrada.nextDouble();

        System.out.println("Olá "+ nomeCliente +  ", obrigado por criar " +
                "uma conta em nosso banco, sua agência é "+ agencia + ", conta "
                + numConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}