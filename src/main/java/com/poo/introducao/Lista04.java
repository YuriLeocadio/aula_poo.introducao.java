package com.poo.introducao;

import java.util.Scanner;

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

    void ex5() {
        Scanner sc = new Scanner(System.in);
        String[] listaCompras = new String[10];
        double[] precos = new double[10];
        int indice = 0;

        while (true) {
            int opcao;
            int numRemover;
            double tempPreco;
            String tempItem;
            String item;

            System.out.println("\nMenu:");
            System.out.println("1 - Inserir item");
            System.out.println("2 - Ver lista de compras");
            System.out.println("3 - Remover item");
            System.out.println("4 - Ordenar por preço crescente");
            System.out.println("5 - Ordenar por preço decrescente");
            System.out.println("6 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha pendente

            switch (opcao) {
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    item = sc.nextLine();

                    listaCompras[indice] = item;
                    System.out.println("Digite o preço do item: ");
                    precos[indice] = sc.nextDouble();

                    indice++;
                    break;

                case 2:
                    System.out.println("\nLista de Compras:");
                    for (int i = 0; i < indice; i++) {
                        System.out.println((i + 1) + " - " + listaCompras[i] + " - R$" + precos[i]);
                    }
                    break;

                case 3:
                    System.out.println("\nDigite o número do item a ser removido: ");
                    numRemover = sc.nextInt();

                    if (numRemover > 0 && numRemover <= indice) {
                        for (int i = numRemover - 1; i < indice - 1; i++) {
                            listaCompras[i] = listaCompras[i + 1];
                            precos[i] = precos[i + 1];
                        }
                        indice--;
                        System.out.println("Item removido com sucesso.");
                    } else {
                        System.out.println("Número de item inválido.");
                    }
                    break;

                case 4:
                    for (int i = 0; i < indice - 1; i++) {
                        for (int j = 0; j < indice - i - 1; j++) {
                            if (precos[j] > precos[j + 1]) {

                                tempPreco = precos[j];
                                precos[j] = precos[j + 1];
                                precos[j + 1] = tempPreco;

                                tempItem = listaCompras[j];
                                listaCompras[j] = listaCompras[j + 1];
                                listaCompras[j + 1] = tempItem;
                            }
                        }
                    }

                    System.out.println("\nLista de Compras ordenada por preço crescente:");
                    for (int i = 0; i < indice; i++) {
                        System.out.println((i + 1) + " - " + listaCompras[i] + " - R$" + precos[i]);
                    }
                    break;

                case 5:
                    for (int i = 0; i < indice - 1; i++) {
                        for (int j = 0; j < indice - i - 1; j++) {
                            if (precos[j] < precos[j + 1]) {
                               
                                tempPreco = precos[j];
                                precos[j] = precos[j + 1];
                                precos[j + 1] = tempPreco;

                                tempItem = listaCompras[j];
                                listaCompras[j] = listaCompras[j + 1];
                                listaCompras[j + 1] = tempItem;
                            }
                        }
                    }

                    System.out.println("\nLista de Compras ordenada por preço decrescente:");
                    for (int i = 0; i < indice; i++) {
                        System.out.println((i + 1) + " - " + listaCompras[i] + " - R$" + precos[i]);
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}