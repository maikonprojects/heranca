package org.example;

public class Empregado extends Pessoa {

    protected int codigoPessoa;
    protected double salarioBase;
    protected double imposto;

    public double calcularSalario(){
        return salarioBase - (salarioBase * (imposto/100));
    }

    public int getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(int codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
