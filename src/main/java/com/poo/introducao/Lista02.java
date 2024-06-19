package com.poo.introducao;

import java.util.Scanner;

public class Lista02 {
    public void ex1() {
        int numeroDigitado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é par ou ímpar: ");
        numeroDigitado = sc.nextInt();

        if (numeroDigitado == 0) {
            System.out.println("O número digitado é zero!");
        } else if (numeroDigitado % 2 == 0) {
            System.out.println("O número digitado é par!");
        } else {
            System.out.println("O ´numero digitado é ímpar");
        }
        sc.close();
    }

    void ex2() {
        double num1;
        double num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = sc.nextDouble();

        System.out.println("Digite outro número: ");
        num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("o número " + num1 + " é maior que o número " + num2);
        } else if (num1 < num2) {
            System.out.println("o número " + num1 + " é menor que o número " + num2);
        } else {
            System.out.println("Os número digitados são iguais!");
        }
        sc.close();
    }

    void ex3() {
        char sexo;
        char gestante = 'n';
        char deficiente;
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu sexo? M/F");
        sexo = sc.next().charAt(0);

        System.out.println("Qual a sua idade? ");
        idade = sc.nextInt();

        if (idade > 65) {
            System.out.println("Encaminhado para fila preferencial.");
        } else if (sexo == 'f' || sexo == 'F') {
            System.out.println("Responda as perguntas com s ou n!");
            System.out.println("----------------------------------");
            System.out.println("Está em gestação? ");
            gestante = sc.next().charAt(0);

            if (gestante == 's' || gestante == 'S') {
                System.out.println("Encaminhado para fila preferencial.");
            } else {
                
                System.out.println("Possui alguma deficiência? ");
                deficiente = sc.next().charAt(0);

                if (deficiente == 's' || deficiente == 'S') {
                    System.out.println("Encaminhado para fila preferencial.");
                } else {
                    System.out.println("Encaminhado para fila comum.");
                }
            }
        } else {
            System.out.println("Responda a pergunta com s ou n!");
            System.out.println("----------------------------------");
            System.out.println("Possui alguma deficiência? ");
            deficiente = sc.next().charAt(0);

            if (deficiente == 's' || deficiente == 'S') {
                System.out.println("Encaminhado para fila preferencial.");
            } else {
                System.out.println("Encaminhado para fila comum.");
            }
        }

        sc.close();
    }
}