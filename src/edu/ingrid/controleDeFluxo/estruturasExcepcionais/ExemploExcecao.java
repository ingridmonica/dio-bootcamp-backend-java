package src.edu.ingrid.controleDeFluxo.estruturasExcepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            Number valor = Double.valueOf("a1.75");
            valor = NumberFormat.getInstance().parse("a1.75");

            System.out.println(valor);
        } catch(ParseException e) {
            e.printStackTrace();
        }

    }
    /* Como seria sem o tratamento de erro:
    Number valor = Double.valueOf("a1.75");
        valor = NumberFormat.getInstance().parse("a1.75");

        *  As duas linhas acima, apresentarão uma exceção ao serem executadas,
        * e a linha 5 contém um método que pode disparar uma exceção checada, logo,
        * nós programadores que iremos usar este método, teremos que tratá-la explicitamente
        * com try \ catch

        System.out.println(valor);
    */
}
