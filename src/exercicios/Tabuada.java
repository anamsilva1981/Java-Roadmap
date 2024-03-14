package exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
//    Imprimir tabuada do numero escolhido pelo usuário

        int entrada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        entrada = scanner.nextInt();

        int multiplicador = 0;
        while (multiplicador <= 10){
            int resultado = entrada * multiplicador;
            System.out.println(resultado);
            multiplicador++;
        }

        scanner.close();
    }
}
