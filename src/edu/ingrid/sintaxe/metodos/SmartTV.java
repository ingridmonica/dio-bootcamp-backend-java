package src.edu.ingrid.sintaxe.metodos;

public class SmartTV {
    boolean ligada;
    int canal;
    int volume;

    public static void main (String [] args){
        SmartTV televisao1 = new SmartTV();

        televisao1.ligarTv();
        System.out.println("A tv está ligada = "+ televisao1.ligada); // true

        televisao1.desligarTv();
        System.out.println("A tv está ligada = "+ televisao1.ligada); // false

        televisao1.aumentarVolume();
        System.out.println("O volume da TV = "+ televisao1.volume); // 1

        televisao1.diminuirVolume();
        System.out.println("O volume da TV = "+ televisao1.volume); // 0

        televisao1.passarCanal();
        System.out.println("O volume da TV = "+ televisao1.canal); // 1

        televisao1.voltarCanal();
        System.out.println("O canal da TV = "+ televisao1.canal); // 0

        televisao1.alterarCanal(5);
        System.out.println("O canal da TV = "+ televisao1.canal); // 5

    }

    // não é estático, assim podendo atuar sobre a instância atual do objeto
    public void ligarTv(){
        // modifica o campo 'ligada' da instância "SmartTV" diretamente
        this.ligada = true;
    }
    public void desligarTv(){
        this.ligada = false;
    }

    public void aumentarVolume(){
        this.volume++;
    }
    public void diminuirVolume(){
        this.volume--;
    }

    public void passarCanal(){
        this.canal++;
    }

    public void voltarCanal(){
        this.canal--;
    }

    public void alterarCanal(int novoCanal){
        this.canal = novoCanal;
    }
}
