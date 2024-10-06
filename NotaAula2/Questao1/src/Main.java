
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = null;

        System.out.print("Digite o nome do titular: ");
        String nome = scanner.nextLine();

        System.out.println("Selecione o tipo de conta: ");
        System.out.println("1. CONTA CORRENTE");
        System.out.println("2. CONTA POUPANÇA");
        System.out.println("opção: ");
        int tipoConta = scanner.nextInt();
        scanner.nextLine();

        if (tipoConta == 1) {
            conta = new ContaCorrente(nome);
        } else if (tipoConta == 2) {
            conta = new ContaPoupanca(nome);
        } else {
            System.out.println("Opção inválida. Encerrando o programa.");
            System.exit(0);

        }

        boolean sair = false;
        while (!sair) {
            System.out.println("\nMenu de Opções:");
            if (conta instanceof ContaCorrente) {
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Usar Cheque Especial");
                System.out.println("4. Exibir Dados da Conta");
                System.out.println("5. Sair");
            } else if (conta instanceof ContaPoupanca) {
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Calcular Rendimento");
                System.out.println("4. Exibir Dados da Conta");
                System.out.println("5. Sair");
            }

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: R$ ");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine();
                    if (conta instanceof ContaCorrente) {
                        ((ContaCorrente) conta).sacar(valorSaque);
                    } else if (conta instanceof ContaPoupanca) {
                        ((ContaPoupanca) conta).sacar(valorSaque);
                    }
                    break;
                case 3:
                    if (conta instanceof ContaCorrente) {
                        // No método sacar já está implementado o uso do cheque especial
                        System.out.println("Opção de cheque especial já integrada no saque.");
                    } else if (conta instanceof ContaPoupanca) {
                        System.out.print("Digite a taxa Selic anual (%): ");
                        double selic = scanner.nextDouble();
                        scanner.nextLine();
                        ((ContaPoupanca) conta).calcularRendimento(selic);
                    }
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 5:
                    sair = true;
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }

        scanner.close();
    }
}