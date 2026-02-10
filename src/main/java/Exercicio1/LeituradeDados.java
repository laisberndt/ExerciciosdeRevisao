package Exercicio1; //define o pacote da classe
import java.util.Scanner; //importa a biblioteca scanner

public class LeituradeDados { //classe principal
    //main pra aparecer na tela
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //inicializa o scanner

        System.out.print("Digite o nome do sensor: ");
        String sensor = scanner.nextLine(); //salva o que foi inserido como "sensor"

        System.out.print("Digite o valor da leitura: ");
        int valor = scanner.nextInt(); //salva o que foi inserido como "valor"

        System.out.println("\nSensor " + sensor + " registrado com o valor de " + valor + " unidades.");
        //aparece as informações coletadas na tela

        scanner.close(); //fecha o scanner
    }
}