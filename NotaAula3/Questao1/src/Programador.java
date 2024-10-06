
public class Programador extends Funcionario {
    private String linguagem;
    private double salario;

    public Programador(String nome, String nasc, double salario, String linguagem) {
        super(nome, nasc, salario);
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.println("A linguagem que o programador usa é: " + linguagem);
    }
    @Override
    public void informarSalario() {
        System.out.println("O salário do Programador é: " + super.salario);
    }
}
