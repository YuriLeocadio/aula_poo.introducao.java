package com.poo.introducao;

import java.util.Scanner;

public class Lista03 {

    public void ex1() {
        int segundos = 0;

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Digite um número entre 1 e 59 para o cronômetro: ");
            if (sc.hasNextInt()) {
                segundos = sc.nextInt();
                if (segundos >= 1 && segundos <= 59) {
                    break;
                } else {
                    System.out.println("Erro: O número deve estar entre 1 e 59.");
                }
            } else {
                System.out.println("Erro: Você deve digitar um número inteiro.");
                sc.next();
            }
        }
        
        
        try {
            for (int i = 0; i < segundos; i++) {
                System.out.println((i + 1) + " segundo(s)");
                Thread.sleep(1000);
            }
            System.out.println("Tempo esgotado!");
        } catch (InterruptedException e) {
            System.out.println("O cronômetro foi interrompido.");
        }
        
        sc.close();
    }

    public void ex2() {
        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        numero = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        sc.close();
    }
}
