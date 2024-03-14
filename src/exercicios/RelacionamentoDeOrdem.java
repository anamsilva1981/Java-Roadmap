package exercicios;

import java.util.Scanner;

public class RelacionamentoDeOrdem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros para serem analizados");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        System.out.println(numberOne + " = " + numberTwo + " ? " + (numberOne == numberTwo));
        System.out.println(numberOne + " != " + numberTwo + " ? " + (numberOne != numberTwo));
        System.out.println(numberOne + " > " + numberTwo + " ? " + (numberOne > numberTwo));
        System.out.println(numberOne + " < " + numberTwo + " ? " + (numberOne < numberTwo));
        System.out.println(numberOne + " >= " + numberTwo + " ? " + (numberOne >= numberTwo));
        System.out.println(numberOne + " =< " + numberTwo + " ? " + (numberOne <= numberTwo));

        scanner.close();
    }
}
