
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de cálculo de corrida do Uber.");
        System.out.print("Informe a distância percorrida (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Informe o tempo de espera (minutos): ");
        int tempoEspera = scanner.nextInt();

        System.out.print("Informe a tarifa base (R$): ");
        double tarifaBase = scanner.nextDouble();

        System.out.print("Informe o fator de demanda (ex: 1.5 para 50% de aumento): ");
        double fatorDemanda = scanner.nextDouble();

        CorridaUber corrida = new CorridaUber(distancia, tempoEspera, tarifaBase, fatorDemanda);

        corrida.exibirDetalhesCorrida();

        scanner.close();
    }
}
