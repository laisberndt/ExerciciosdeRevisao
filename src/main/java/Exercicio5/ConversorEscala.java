package Exercicio5; //define o pacote da classe
import java.util.Scanner; //importa a biblioteca para usar o scanner

public class ConversorEscala { //classe principal
    //metodo principal (main)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //inicializa o scanner
        System.out.print("Insira o valor bruto: "); //aparece na tela
        double valorBruto = scanner.nextDouble(); //salva o que foi lido como "valorBruto"
        double resultado = converterEscala(valorBruto); //chama o metodo converter escala
        System.out.println("\nO valor na escala de 0-100% é: " + resultado + "%");
        //aparece o resultado na tela

        scanner.close(); //fecha o scanner
    }

    //Método estático Converter escala
    public static double converterEscala(double valorBruto) { //metodo responsável por fazer a conversão
        return (valorBruto / 1023.0) * 100; //fórmula para saber a porcentagem
    }

}