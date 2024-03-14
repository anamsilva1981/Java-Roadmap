package tiposDeDadosString;

//Usado para representar uma cadeia de carateres

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String texto = "Um texto para ser impresso";
        System.out.println(texto);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome ");
        String nome = scanner.nextLine(); // o valor escrito até o 'Enter'
//        String nome = scanner.next(); // Somente a primeira palavra
        System.out.println("Olá, " + nome);
        scanner.close();

    }
}
