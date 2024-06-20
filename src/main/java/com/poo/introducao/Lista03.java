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

    public void ex3() {
        int num1;
        int num2;
        int menor;
        int maior;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();
        
        menor = Math.min(num1, num2);
        maior = Math.max(num1, num2);
        
        System.out.println("Números pares entre " + menor + " e " + maior + ":");

        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }

    public void ex4() {
        int numeroEscolhido;
        int tentativa;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um número (Jogador 1): ");
        numeroEscolhido = sc.nextInt();
        
        System.out.println("Adivinhe o número (Jogador 2): ");
        while (true) {
            tentativa = sc.nextInt();
            if (tentativa == numeroEscolhido) {
                System.out.println("Parabéns! Você acertou.");
                break;
            } else if (Math.abs(tentativa - numeroEscolhido) <= 2) {
                System.out.println("Quase lá!");
            } else if (tentativa < numeroEscolhido) {
                System.out.println("Muito baixo.");
            } else {
                System.out.println("Muito alto.");
            }
        }
        sc.close();
    }
}
