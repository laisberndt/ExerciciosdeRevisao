package Exercicio2; //define o pacote da classe
import java.util.Scanner; //importa a biblioteca do scanner para leitura de dados do teclado

public class ControledeSegurança { //classe principal
    //metodo principal (main)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //inicializa o scanner
        System.out.print("Digite o nível do tanque: "); //mostra na tela
        int valor = scanner.nextInt(); //salva o que foi inserido como "valor"

        scanner.close(); //fecha o scanner

        //condicionais
        if (valor >= 90) {
            System.out.println("ALERTA: Nível Crítico - Abrir válvula de Escoamento!");
        } else if (valor < 10) {
            System.out.println("ALERTA: Nível Baixo - Ativar bomba de Enchimento!");
        } else {
            System.out.println("Sistema estável");
        }
        System.out.println("TESTE2");
    }
}