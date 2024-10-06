// Questão 1
// Elabore um programa em java que informe se um aluno ele está aprovado, reprovado ou na final
// O sistema deve solicitar o nome e as notas
// Em seguida, realiza o cálculo da média e informa a situação acadêmica
// Se a média for >= 7,0 está aprovado, abaixo de 4,0 está reprovado, senão está na final.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        String nome = input.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) /3;

        System.out.println("Aluno:" + nome);
        System.out.printf("Média: %.2f%n", media);

        if (media >=7) {
            System.out.println("Aprovado");
        }else if (media <4) {
            System.out.println("Reprovado");
        }else{
            System.out.println("Final");

        }
    }
}