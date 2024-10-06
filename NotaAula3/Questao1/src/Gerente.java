
public class Gerente extends Funcionario {
    private String projeto;

    public Gerente(String nome, String nasc, double salario, String projeto) {
        super(nome, nasc, salario);
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.println("O projeto é: " + projeto);
    }
}