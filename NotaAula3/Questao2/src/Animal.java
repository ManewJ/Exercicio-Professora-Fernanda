import java.security.PublicKey;

public class Animal {
    protected String nome;
    protected String raca;

    public Animal() {
        this.nome = "sem nome";
        this.raca = "RND";
    }

    public Animal(String nome) {
        this.nome = nome;
        this.raca = "RND";
    }

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void caminha() {
        System.out.println(nome + " Está caminhando.");
    }

    public String getRaca() {
        return this.raca;
    }

}