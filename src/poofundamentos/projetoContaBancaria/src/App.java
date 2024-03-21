package poofundamentos.projetoContaBancaria.src;

import poofundamentos.projetoContaBancaria.src.model.ContaCorrente;
import poofundamentos.projetoContaBancaria.src.model.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando nosso banco digital");
        System.out.println();

        ContaCorrente contaCorrente = new ContaCorrente("0001", "7542", 1, 100.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca("0001", "7543", 1, 200.0);

        System.out.println("O saldo atual da conta corrente é de R$ " + contaCorrente.getSaldo());
        System.out.println();

        contaCorrente.depositar(250.0);
        System.out.println("O saldo atual da conta corrente é de R$ " + contaCorrente.getSaldo());
        System.out.println();

        var saque = contaCorrente.sacar(150.0);
        System.out.println("O saldo atual da conta corrente é de R$ " + contaCorrente.getSaldo());
        System.out.println();

        contaPoupanca.transferencia(100.0, contaCorrente);
        System.out.println("Saldo da conta corrente " + contaCorrente.getSaldo());
        System.out.println("Saldo da conta poupança " + contaPoupanca.getSaldo());

        System.out.println();

        System.err.println("Saldo da conta corrente atual " + contaCorrente.getSaldo());
        System.err.println("Saldo da conta poupanca atual " + contaPoupanca.getSaldo());
        System.out.println();
    }
    
}
