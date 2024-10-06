
public class Gato extends Animal {
    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    public void mia(){
        System.out.println(nome + " Está miando! ");
    }
}
