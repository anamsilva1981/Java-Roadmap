package baseJava;

//Tipos primitivos do Java - São providos pela linguagem nativamente
public class tiposPrimitivosNotasEstudos {
    public static void main(String[] args){
        char primeiraLetraDoNome = 'A';

        System.out.println(primeiraLetraDoNome);

        // Valores inteiros / Integers
        byte nota = 10; // -127 até 127
        short itensComprados = 2; // de -32768 até 32767
        int quantidadeEmEstoque = 23366; // até 2 bilhões
        long numeroMuitoGrande = 456879321325465L; // +/- 19 digitos

        /* Tipos Decimais */
        float peso = 1.5f; // até 7 casas decimais com pontos
        double precos = 24.99; //até 15 casas decimais

        // Tipos booleans
        boolean verdadeiro = true;
        boolean falso = false;
    }
}