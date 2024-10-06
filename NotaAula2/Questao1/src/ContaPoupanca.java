
public class ContaPoupanca extends Conta {
    public ContaPoupanca(String nomeTitular) {
        super(nomeTitular);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void calcularRendimento(double selic) {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }
        saldo += rendimento;
        System.out.printf("Rendimento calculado: R$ %.2f%n", rendimento);
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Conta Poupança ===");
        System.out.println("Titular: " + nomeTitular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}

