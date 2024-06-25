package src.edu.ingrid.controleDeFluxo.estruturasRepeticao;

public class ForEach {
    public static void main(String[] args) {
        // For em Array ou coleção - foreach
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        //Forma abreviada -> é criada uma variável 'aluno' obtendo um elemento do vetor a cada ocorrência
        for(String aluno : alunos) {
            System.out.println(alunos);
        }
    }
}
