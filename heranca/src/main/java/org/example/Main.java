package org.example;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Frederico");
        fornecedor.setValorCredito(297.35);
        fornecedor.setValorDivida(100.00);
        System.out.println(fornecedor.obterSaldo());

        System.out.println("---------------------------------------");

        System.out.println("Cálculo salário base: ");
        Empregado empregado = new Empregado();
        empregado.setImposto(10);
        empregado.setSalarioBase(1000);
        System.out.println(empregado.calcularSalario());

        System.out.println("---------------------------------------");

        System.out.println("Cálculo salário base ADM: ");
        Administrador adm = new Administrador();
        adm.setSalarioBase(1500.00);
        adm.setAjudaDeCusto(300.00);
        System.out.println(adm.calcularSalario());

        System.out.println("---------------------------------------");

        System.out.println("Cálculo de salário operário: ");
        Operario operario = new Operario();
        operario.setComissao(10);
        operario.setValorProducao(1000);
        operario.setSalarioBase(2500);
        System.out.println(operario.calcularSalario());

        System.out.println("---------------------------------------");
        System.out.println("Cálculo de salário vendedor: ");
        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(10);
        vendedor.setValorVenda(500);
        vendedor.setSalarioBase(2000);
        System.out.println(vendedor.calcularSalario());





    }
}