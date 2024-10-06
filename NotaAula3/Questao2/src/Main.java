
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Paçoca", "Shitzu");
        Gato gato = new Gato("Jurubeba", "Siamês");

        System.out.println("===========");
        System.out.println("O cachorro " + cachorro.nome + " é da raça " + cachorro.getRaca());
        cachorro.late();
        cachorro.caminha();

        System.out.println("\n========\n");

        System.out.println("O gato " + gato.nome + " é da raça " + gato.getRaca());
        gato.mia();
        gato.caminha();

        }
    }
