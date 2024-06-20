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

    void ex2() {
        Double[] vendas = { 150.50, 320.75, 80.20, 210.30, 430.10 };

        Double menorValor = Double.MAX_VALUE;
        Double maiorValor = Double.MIN_VALUE;

        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] < menorValor) {
                menorValor = vendas[i];
            }
            if (vendas[i] > maiorValor) {
                maiorValor = vendas[i];
            }
        }

        System.out.println("Menor valor de venda do dia: R$" + String.format("%.2f", menorValor));
        System.out.println("Maior valor de venda do dia: R$" + String.format("%.2f", maiorValor));
    }

    void ex3() {
        double[] vendas = { 150.50, 320.75, 80.20, 210.30, 430.10 };
        double totalVendas = 0;
        double ticketMedio;

        for (int i = 0; i < vendas.length; i++) {
            totalVendas += vendas[i];
        }

        ticketMedio = totalVendas / vendas.length;

        System.out.println("Ticket médio de vendas do dia: R$" + ticketMedio);
    }

    public void ex4() {
        int[] lista = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };
        int contaPares = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                contaPares++;
            }
        }

        System.out.println("Quantidade de números pares na lista: " + contaPares);
    }
}
