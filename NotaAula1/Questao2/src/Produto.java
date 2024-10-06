public class Produto {
    private String codigo;
    private String nome;
    private String tamanhoPeso;
    private String cor;
    private double valor;
    private int quantidadeEstoque;

    public Produto(String codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Código='" + codigo + '\'' +
                ", Nome='" + nome + '\'' +
                ", Tamanho/Peso='" + tamanhoPeso + '\'' +
                ", Cor='" + cor + '\'' +
                ", Valor=" + valor +
                ", Quantidade em Estoque=" + quantidadeEstoque +
                '}';
    }
}

