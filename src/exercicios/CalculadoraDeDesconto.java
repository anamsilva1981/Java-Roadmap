package exercicios;

import java.util.Scanner;

public class CalculadoraDeDesconto {
    public static void main(String[] args) {
        /*
        * Imprimir o preço de um produto com base no desconto a cista eo
        * valor economizado.
        * 1. ler preço
        * 2. ler % de desconto
        * 3. Imprimir novo preço e o valor economizado em reais
        *
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor do produto");
        int priceOfTheProduct = scanner.nextInt();

        System.out.println("Digite a porcentagem do desconto");
        int discoubtPercentage = scanner.nextInt();

        int finalValue =  priceOfTheProduct - ((priceOfTheProduct / 100) * discoubtPercentage) ;
        int valueSaved =  priceOfTheProduct - finalValue;
        System.out.println("O valor total com desconto é "+ finalValue);
        System.out.println("O valor do desconto foi de "+ valueSaved);

    }
}
