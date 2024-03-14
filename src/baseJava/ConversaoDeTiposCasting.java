package baseJava;

//Casting: Operação de transformar um tipo de dados em outro.
//Widening Casting vs Narrowing Casting
public class ConversaoDeTiposCasting {
    public static void main(String[] args) {
        // Widening Casting (Implicito)
        byte variavelPequena = 1;
        int variavelGrande = variavelPequena;

        short variavelShort = 10;
        int variavelInt = variavelShort;

        System.out.println(variavelGrande);
        System.out.println(variavelInt);

        // Narrowing Casting (Explícito)
        long variavelLong = 6543215465465321321L;
        int variavelIn = (int) variavelLong;
        System.out.println(variavelIn);

        // Divisao de dois numeros inteiros com resultado quebrado
        int numInt1 = 9;
        int numInt2 = 2;
        float resultadoDivisao =  numInt1 / (float) numInt2;
        System.out.println(resultadoDivisao);
    }
}
