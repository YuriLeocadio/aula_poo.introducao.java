package com.poo.introducao;

import java.util.Scanner;

public class Lista01 {

    public void ex1() {
        int num1;
        int num2;
        int resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");

        num1 = sc.nextInt();

        System.out.println("Digite outro número: ");

        num2 = sc.nextInt();

        resultado = num1 + num2;

        System.out.println("A soma de " + num1 + " + " + num2 + " é igual à: " + resultado);
        sc.close();
    }

    void ex2(){
        String nome;
        String sobrenome;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = sc.nextLine();

        System.out.println("Seja Bem-Vindo ao nosso programa " + nome + " " + sobrenome + " :)");
    }
}