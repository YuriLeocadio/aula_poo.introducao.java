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

    void ex2(){
        double num1;
        double num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = sc.nextDouble();

        System.out.println("Digite outro número: ");
        num2 = sc.nextDouble();

        if(num1 > num2){
            System.out.println("o número " + num1 + " é maior que o número " + num2);
        } else if(num1 < num2){
            System.out.println("o número " + num1 + " é menor que o número " + num2);
        } else {
            System.out.println("Os número digitados são iguais!");
        }
    }
}