package exercicios;

import java.util.Scanner;

public class MediaAritimetrica {
    public static void main(String[] args) {

        /*
        * Dadas 3 notas, imprimir a media aritmetica do aluno
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as 3 notas do aluno ");
        double nota1 = scanner.nextInt();
        double nota2 = scanner.nextInt();
        double nota3 = scanner.nextInt();

        scanner.close();

        double media = (nota1 + nota2 + nota3 ) / 3;

        System.out.println(" A Media do aluno foi " + media);

    }
}
