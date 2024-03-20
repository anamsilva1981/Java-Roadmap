package poofundamentos.projeto.src;

import poofundamentos.projeto.src.model.ContaBancaria;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando nosso banco digital");
        System.out.println();

        ContaBancaria conta = new ContaBancaria("0001", "7542", 1, 100.0);

        System.out.println("O saldo atual da conta é de R$ " + conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("O saldo atual da conta é de R$ " + conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(150.0);
        System.out.println("O saldo atual da conta é de R$ " + conta.getSaldo());
        System.out.println();

    }
    
}
