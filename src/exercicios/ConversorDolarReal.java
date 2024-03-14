package exercicios;

import java.util.Scanner;

/*
 * Faça um programa que converta um valor em dólar em reais.
 * 
 * Ex: Dólares = 100, Cotação = 4,92 => O valor em reais é R$ 492,00.
 */
public class ConversorDolarReal {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a quantidade de dolares");
    double dolares = scanner.nextDouble();

    System.out.println("Informe a cotaçao do dolar do dia");
    double cotacaoDolar = scanner.nextDouble();

    double conversaoDolaresEmReais = dolares * cotacaoDolar;
    System.out.printf("O valor em reais é %.2f", conversaoDolaresEmReais);
  }
}
