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
    }
}