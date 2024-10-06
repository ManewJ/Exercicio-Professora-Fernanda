import java.util.Scanner;

public class ContaCorrente extends Conta {
    private double chequeEspecial;
    private final double LIMITE_CHEQUE_ESPECIAL = 1000.0;

    public ContaCorrente(String nomeTitular) {
        super(nomeTitular);
        this.chequeEspecial = LIMITE_CHEQUE_ESPECIAL;
    }

    public void sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }else if (valor <= saldo + chequeEspecial) {
            double valorNecessarioDoCheque = valor - saldo;
            saldo = 0;
            chequeEspecial -= valorNecessarioDoCheque;
            System.out.println("Saque realizado utilizando cheque especial.");
        }else {
            System.out.println("Saldo insuficiente, inclusive com o cheque");
        }
    }

@Override
public void exibirDados() {
    System.out.println("=== Conta Corrente ===");
    System.out.println("Titular: " + nomeTitular);
    System.out.printf("Saldo: R$ %.2f%n", saldo);
    System.out.printf("Cheque Especial Disponível: R$ %.2f%n", chequeEspecial);
}
}
