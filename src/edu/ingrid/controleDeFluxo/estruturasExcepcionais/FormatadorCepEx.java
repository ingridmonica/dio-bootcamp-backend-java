package src.edu.ingrid.controleDeFluxo.estruturasExcepcionais;

public class FormatadorCepEx {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {
            // throw new RuntimeException(e);
            System.out.println("O cep deve ter 8 dígitos");
        }
    }

    // Deteminamos que ele lança uma exceção
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();
        // quando o nº caracteres < 8  Lança uma exceção

        //simulando um cep formatado
        return "23.765-064";
    }
}
