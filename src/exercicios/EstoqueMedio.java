package exercicios;

import java.util.Scanner;

/*Faça um programa para calcular o estoque medio de uma peça, seguindo a
formula:
Estoque medio = ( quantidade minima + quantidade maxima) / 2
*/
public class EstoqueMedio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade máxima do estoque");
        int quantidadeMaxima = scanner.nextInt();

        System.out.println("Informe a quantidade mínima do estoque");
        int quantidadeMinima = scanner.nextInt();

        double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
        System.out.println("O estoque medio de cada peça é " + estoqueMedio);

        scanner.close();

    }
}
