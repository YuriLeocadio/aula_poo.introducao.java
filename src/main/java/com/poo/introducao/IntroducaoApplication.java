package com.poo.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class IntroducaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroducaoApplication.class, args);

        int listaEscolhida;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a lista (1-4): ");
        listaEscolhida = sc.nextInt();

        switch (listaEscolhida) {
            case 1:
                Lista01 lista01 = new Lista01();
                executarExercicio(lista01, sc);
                break;

            case 2:
                Lista02 lista02 = new Lista02();
                executarExercicio(lista02, sc);
                break;

            case 3:
                Lista03 lista03 = new Lista03();
                executarExercicio(lista03, sc);
                break;

            case 4:
                Lista04 lista04 = new Lista04();
                executarExercicio(lista04, sc);
                break;
            default:
                System.out.println("Lista não encontrada!");
        }

        sc.close();
    }

    private static void executarExercicio(Lista01 lista, Scanner sc) {
        int exercicio;

        System.out.println("Escolha o exercício (1-8) da Lista 01: ");
        exercicio = sc.nextInt();

        switch (exercicio) {
            case 1:
                lista.ex1();
                break;

            case 2:
                lista.ex2();
                break;

            case 3:
                lista.ex3();
                break;

            case 4:
                lista.ex4();
                break;

            case 5:
                lista.ex5();
                break;

            case 6:
                lista.ex6();
                break;

            case 7:
                lista.ex7();
                break;

            case 8:
                lista.ex8();
                break;
            default:
                System.out.println("Exercício não encontrado!");
        }
    }

    private static void executarExercicio(Lista02 lista, Scanner sc) {
        int exercicio;
        
        System.out.println("Escolha o exercício (1-8) da Lista 02: ");
        exercicio = sc.nextInt();

        switch (exercicio) {
            case 1:
                lista.ex1();
                break;

            case 2:
                lista.ex2();
                break;

            case 3:
                lista.ex3();
                break;

            case 4:
                lista.ex4();
                break;

            case 5:
                lista.ex5();
                break;

            case 6:
                lista.ex6();
                break;

            case 7:
                lista.ex7();
                break;

            case 8:
                lista.ex8();
                break;
            default:
                System.out.println("Exercício não encontrado!");
        }
    }

    private static void executarExercicio(Lista03 lista, Scanner sc) {
        int exercicio;
        
        System.out.println("Escolha o exercício (1-8) da Lista 03: ");
        exercicio = sc.nextInt();

        switch (exercicio) {
            case 1:
                lista.ex1();
                break;

            case 2:
                lista.ex2();
                break;

            case 3:
                lista.ex3();
                break;

            case 4:
                lista.ex4();
                break;

            case 5:
                lista.ex5();
                break;

            case 6:
                lista.ex6();
                break;

            case 7:
                lista.ex7();
                break;
            default:
                System.out.println("Exercício não encontrado!");
        }
    }

    private static void executarExercicio(Lista04 lista, Scanner sc) {
        int exercicio;
        
        System.out.println("Escolha o exercício (1-8) da Lista 04: ");
        exercicio = sc.nextInt();

        switch (exercicio) {
            case 1:
                lista.ex1();
                break;

            case 2:
                lista.ex2();
                break;

            case 3:
                lista.ex3();
                break;

            case 4:
                lista.ex4();
                break;

            case 5:
                lista.ex5();
                break;

            case 6:
                lista.ex6();
                break;
                
            case 7:
                lista.ex7();
                break;
            default:
                System.out.println("Exercício não encontrado!");
        }
    }
}