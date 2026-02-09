package Exercicio3; //define o pacote da classe
import java.util.Scanner; //importa a biblioteca do scanner para leitura de dados do teclado

public class MediadeProducao { //classe principal
    //metodo principal (main)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //inicializa o scanner
        int total = 0; //inicialmente não tem nenhum valor
        int i = 1; //para somar a quantidade de horas

        //condicional
        while (i <= 5) {
            System.out.print("Digite o valor da hora " + i + ": "); //aparece na tela
            int valorHora = scanner.nextInt(); //salva o que foi lido como "valorHora"
            total += valorHora; //soma o valor lido ao total
            i++; //adiciona 1 à lista
        }

        double media = (double) total / 5; //calcula a média
        System.out.println("A média dos 5 valores inseridos é: " + media); //aparece na tela

        scanner.close(); //fecha o scanner
    }
}