package exercicios;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        /*
        * Escreva um programa que leia uma idade em anos e imprima essa idade
        *  em dias
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade ");
        int idadeEmAnos =  scanner.nextInt();
        int idadeConvertida = idadeEmAnos * 365;

        scanner.close();

        System.out.println("Sua idade em dias é " + idadeConvertida);
    }
}
