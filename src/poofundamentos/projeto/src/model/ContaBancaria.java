package poofundamentos.projeto.src.model;

import java.util.InputMismatchException;

public class ContaBancaria {
    
    //#region Atributos
    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;
    // Constantes no Java sao escritos em maiusculas e nunca mudam
    private Double VALOR_MINIMO_DEPOSITO = 10.0;
    //#endregion


    //#region Constructor
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldo;
    }
    //#endregion


    //#region Getters e Setters 

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //#endregion
    

    //#region Métodos
    public void depositar(Double valor){
    
        if(valor < VALOR_MINIMO_DEPOSITO){
            throw new InputMismatchException("O valor minimo de depósito é " + VALOR_MINIMO_DEPOSITO);
        }
        this.saldo += valor; // ou this.saldo = this.saldo + valor;
    }

    public Double sacar(Double valor){
        if( valor > this.saldo){
            throw new InputMismatchException("Saldo insuficiente ");
        }
        this.saldo -= valor;

        return valor;
    }

    //#endregion

}
