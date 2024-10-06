
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    private String nome;
    private String nasc;
    public double salario;


    public Funcionario(String nome, String nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public void informarSalario() {
        System.out.println("O salário do Funcionário é: " + salario);


    }


    public int calcularIdade() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(nasc, formato);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public void informarInformacoes() {
        System.out.println("\n ==== DADOS DO FUNCIONÁRIO ====");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + nasc);
        System.out.println("Idade: " + calcularIdade());
        System.out.println("Salário: R$" + salario);
        System.out.println(" ====    =====        =====");
    }
}

