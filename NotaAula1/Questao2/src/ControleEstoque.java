//Questão 2
// Crie um sistema para controle de um produto com atributos, código, nome, tamanho/peso, cor, valor e quantidade no
// estoque
// O sistema deve permitir o cadastro dos dados, além de realizar a venda e fazer o controle do estoque
// Para o pagamento, temos os seguintes benefícios:
// pix, especie, transferência ou débito, 5% de desconto.
// Crédito, parcelar em 3x sem juros.
// Observação: Espécie, caso o valor pago seja maior que o valor do produto informar o troco.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleEstoque {
    private List<Produto> produtos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void cadastrarProduto() {
        System.out.println("Cadastro de Produto");
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Tamanho/Peso: ");
        String tamanhoPeso = scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        System.out.print("Quantidade em Estoque: ");
        int quantidadeEstoque = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Produto produto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidadeEstoque);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!\n");
    }

    public void realizarVenda() {
        System.out.println("Venda de Produto");
        System.out.print("Código do Produto: ");
        String codigo = scanner.nextLine();
        Produto produto = buscarProduto(codigo);

        if (produto == null) {
            System.out.println("Produto não encontrado!");
            return;
        }

        System.out.println(produto);
        System.out.print("Quantidade a ser vendida: ");
        int quantidadeVendida = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        if (quantidadeVendida > produto.getQuantidadeEstoque()) {
            System.out.println("Estoque insuficiente!");
            return;
        }

        double valorVenda = produto.getValor() * quantidadeVendida;
        double valorComDesconto = aplicarDesconto(valorVenda);
        System.out.printf("Valor final da venda: R$ %.2f%n", valorComDesconto);

        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidadeVendida);
        System.out.println("Venda realizada com sucesso!\n");
    }

    private Produto buscarProduto(String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }

    private double aplicarDesconto(double valorVenda) {
        System.out.println("Formas de Pagamento:");
        System.out.println("1. Pix");
        System.out.println("2. Espécie");
        System.out.println("3. Transferência");
        System.out.println("4. Débito");
        System.out.println("5. Crédito (3x sem juros)");
        System.out.print("Selecione a forma de pagamento: ");
        int opcaoPagamento = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        if (opcaoPagamento >= 1 && opcaoPagamento <= 4) {
            valorVenda *= 0.95; // Aplicar 5% de desconto
        }

        if (opcaoPagamento == 2) {
            System.out.print("Valor recebido: ");
            double valorRecebido = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
            if (valorRecebido > valorVenda) {
                double troco = valorRecebido - valorVenda;
                System.out.printf("Troco: R$ %.2f%n", troco);
            }
        } else if (opcaoPagamento == 5) {
            System.out.println("Pagamento em 3x sem juros.");
            System.out.printf("Parcelas de R$ %.2f%n", valorVenda / 3);
        }

        return valorVenda;
    }

    public static void main(String[] args) {
        ControleEstoque controle = new ControleEstoque();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Controle de Estoque");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Realizar Venda");
            System.out.println("3. Sair");
            System.out.print("Selecione uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    controle.cadastrarProduto();
                    break;
                case 2:
                    controle.realizarVenda();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }
}