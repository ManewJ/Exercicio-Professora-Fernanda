
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", "01/01/1980", 5000, "Sistema de Vendas");
        Programador programador = new Programador("Maria", "15/03/1990", 4000, "Python");
        Funcionario funcionario = new Funcionario("João da Silva", "01/01/1980", 5000.0);

        funcionario.informarInformacoes();

        gerente.informarSalario();
        gerente.informarProjeto();

        programador.informarSalario();
        programador.informarLinguagem();




    }
}