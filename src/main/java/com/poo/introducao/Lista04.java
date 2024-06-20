package com.poo.introducao;

public class Lista04 {

    public void ex1() {
        double[] vendas = { 150.50, 320.75, 80.20, 210.30, 430.10 };

        double totalVendas = 0;
        for (int i = 0; i < vendas.length; i++) {
            totalVendas += vendas[i];
        }

        System.out.println("Fechamento das vendas do dia: R$" + totalVendas);
    }
}
