package org.example;

public class Fornecedor extends Pessoa{
    protected double valorCredito;
    protected double valorDivida;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double obterSaldo(){
        return valorCredito - valorDivida;
    }




}
