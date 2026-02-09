package Exercicio4; //define o pacote da classe

public class HistoricodeEstados { //classe principal
    //metodo principal (main)
    public static void main(String[] args) {
        int[] historico = {1, 0, 1, 1}; //cria um vetor com histórico
        int contador = 0; //contador inicia em 0

        for (int i = 0; i <= 3; i++) { //i está em 0 pois o array começa em 0
            if (historico[i] == 1) { //confere se o valor é 1, se sim, soma ao contador
                contador++; //soma ao contador
            }
        }

        System.out.println("A máquina operou " + contador + " vezes."); //mostra na tela
    }
}