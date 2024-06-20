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

    void ex4() {
        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Entrada proibida.");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Entrada permitida somente acompanhado pelos responsáveis.");
        } else {
            System.out.println("Entrada permitida.");
        }
        sc.close();
    }

    void ex5() {
        String login = "admin";
        String senha = "123";
        String loginDigitado;
        String senhaDigitada;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu login: ");
        loginDigitado = sc.nextLine();

        System.out.println("Digite sua senha: ");
        senhaDigitada = sc.nextLine();

        if (!login.equals(loginDigitado) && !senha.equals(senhaDigitada)) {
            System.out.println("Login e senha incorretos.");
        } else if (!login.equals(loginDigitado)) {
            System.out.println("Login incorreto.");
        } else if (!senha.equals(senhaDigitada)) {
            System.out.println("Senha incorreta.");
        } else {
            System.out.println("Login bem-sucedido");
        }
        sc.close();
    }

    void ex6() {
        double nota1;
        double nota2;
        double maiorNota;
        double menorNota;
        double media;
        double recuperacao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;
        if (media >= 6) {
            System.out.println("Aprovado com média: " + media);
        } else {
            System.out.println("Ops! Parece que você está abaixo da média");
            System.out.println("Digite a nota de recuperação: ");
            recuperacao = sc.nextDouble();

            if (nota1 > nota2) {
                menorNota = nota2;
                maiorNota = nota1;
            } else {
                menorNota = nota1;
                maiorNota = nota2;
            }

            if (recuperacao > menorNota) {
                media = (maiorNota + recuperacao) / 2;
            }

            if (media >= 6) {
                System.out.println("Aprovado! Sua média foi: " + media);
            } else {
                System.out.println("Reprovado! Sua média foi: " + media);
            }
        }
        sc.close();
    }

    void ex7(){
        int numero;
        int divisor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        System.out.println("Digite o divisor: ");
        divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Divisão por zero não é permitida.");
        } else if ((numero % divisor) == 0) {
            System.out.println(numero + " É divisivel por " + divisor);
        } else {
            System.out.println(numero + " Não é divisivel por " + divisor);
        }
    }    

    void ex8() {
        int erros = 0;
        int acertos = 0;
        
        Scanner sc = new Scanner(System.in);

        String[] perguntas = {
            "Qual a capital da França?\n(a) Paris\n(b) Londres\n(c) Roma",
            "Qual é o maior planeta do Sistema Solar?\n(a) Terra\n(b) Júpiter\n(c) Marte",
            "Qual é o elemento químico representado pela fórmula H₂O?\n(a) Ácido\n(b) Água\n(c) Osmium",
            "Qual foi o principal fundador da Apple??\n(a) Steve Jobs\n(b) Ellon Musk\n(c) Mark Zuckerberg",
            "Qual é o idioma oficial do Brasil?\n(a) Espanhol\n(b) Português\n(c) Inglês"
        };

        char[] respostas = {'a','b','b','a','b'};

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            char resposta = sc.next().charAt(0);

            if (resposta == respostas[i]) {
                acertos++;
                System.out.println("Resposta correta!");
            } else {
                erros++;
                System.out.println("Resposta errada!");
                if (erros == 3) {
                    System.out.println("Você errou 3 vezes. Fim do jogo!");
                    break;
                }
            }
        }

        if (erros < 3) {
            System.out.println("Parabéns! Você terminou o jogo com " + acertos + " acertos.");
        }

        sc.close();
    }
}