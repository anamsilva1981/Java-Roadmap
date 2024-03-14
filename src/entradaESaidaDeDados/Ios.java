package entradaESaidaDeDados;

import java.util.Scanner;

//Entrada e saida de dados no Java - pelo usuário (I/O).
//Entrada de dados: Ler dados digitados pelo usuário
//Saida de dados: Escrever dados para o usuário

public class Ios {
    public static void main(String[] args) {
// Leitura de dados de entrada
        System.out.println("Digite um numero");
        Scanner scanner = new Scanner(System.in);
        int valorDigitado = scanner.nextInt();
        System.out.println(valorDigitado);
        scanner.close();

// Saida de dados
        System.out.printf("O numero formatado foi %d ", valorDigitado);
    }
}
