package org.example;

public class Operario extends Empregado {

    protected double valorProducao;
    protected double comissao;

    @Override
    public double calcularSalario() {
        return super.salarioBase + (valorProducao * (comissao/100));
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
