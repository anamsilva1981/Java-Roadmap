package baseJava;

public class TiposDeOperadores {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

//        ex01 soma
        System.out.print(numero2+numero2);

//        ex02 soma
        int soma = numero2 + numero1;
        System.out.print(soma);
        System.out.println("A soma é " + soma);

//        ex03 Subtração
        int subtracao = numero2 - numero1;
        System.out.println("A subtração é " + subtracao);

//        ex04 multiplicação
        int multiplicacao = numero2 * numero1;
        System.out.println("A multiplicação é " + multiplicacao);

//        ex05 divisao
        int divisao = numero2 / numero1;
        System.out.println("A divisao é " + divisao);

//        Modulo - resto da divisao
        int modulo = numero2 % numero1;
        System.out.println("O modulo é " + modulo);

//        Incremento e decremento
        int contador = 0;
        contador = contador + 1;
        contador = contador + 1;
        // ou
        contador++;
        System.out.println(contador);

    }
}
