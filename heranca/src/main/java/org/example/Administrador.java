package org.example;

public class Administrador extends Empregado{
    protected double ajudaDeCusto;

    @Override
    public double calcularSalario() {
        return super.salarioBase + ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
