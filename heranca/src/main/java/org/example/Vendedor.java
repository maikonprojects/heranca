package org.example;

public class Vendedor extends Empregado{
    protected double valorVenda;
    protected double comissao;

    @Override
    public double calcularSalario() {
        return super.salarioBase + (valorVenda * (comissao/100));
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
