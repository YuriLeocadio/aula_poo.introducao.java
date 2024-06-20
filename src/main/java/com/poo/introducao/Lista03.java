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

    public void ex5() {
        String login = "adm";
        String senha = "123";
        String loginDigitado;
        String senhaDigitada;
        int tentativas = 0;

        Scanner sc = new Scanner(System.in);
        
        while (tentativas < 3) {
            System.out.println("Digite o login: ");
            loginDigitado = sc.nextLine();
            System.out.println("Digite a senha: ");
            senhaDigitada = sc.nextLine();
            
            if (loginDigitado.equals(login) && senhaDigitada.equals(senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                if (!loginDigitado.equals(login) && !senhaDigitada.equals(senha)) {
                    System.out.println("Login e senha incorretos");
                }
                else if (!loginDigitado.equals(login)) {
                    System.out.println("Login incorreto.");
                }
                else if (!senhaDigitada.equals(senha)) {
                    System.out.println("Senha incorreta.");
                }
                tentativas++;
                if (tentativas == 2) {
                    System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
                }
            }
        }
        
        if (tentativas == 3) {
            System.out.println("Acesso bloqueado após 3 tentativas erradas.");
        }
        sc.close();
    }

    public void ex6() {
        int andares;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de andares da pirâmide: ");
        andares = sc.nextInt();
        
        for (int i = 1; i <= andares; i++) {
            for (int espacos = 1; espacos <= andares - i; espacos++) {
                System.out.print(" ");
            }
            for (int asteristicos = 1; asteristicos <= (2 * i - 1); asteristicos++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

    public void ex7() {
        int largura;
        int altura;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do retângulo: ");
        largura = sc.nextInt();

        System.out.println("Digite a altura do retângulo: ");
        altura = sc.nextInt();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
