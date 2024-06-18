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
        sc.close();
    }

    void ex3(){
        Double reais;
        Double dolar;

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Sou uma calculadora de conversão de Real para Dolar.");

        System.out.println("Digite um valor em reais (R$): ");
        reais = sc.nextDouble();

        dolar = reais / 5.25;
        System.out.println("R$" + String.format("%.2f", reais) + " convertidos em dólar equivalem a: " + String.format("%.2f", dolar));
        sc.close();
    }

    void ex4(){
        int numeroDigitado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        numeroDigitado = sc.nextInt();

        System.out.println("O antecessor de " + numeroDigitado + " é: " + (numeroDigitado - 1) + " e o sucessor é: " + (numeroDigitado + 1)
        );
        sc.close();
    }

    void ex5(){
        int largura;
        int comprimento;
        int area;
        double valorM2;
        Double valorTotal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a largura do terreno: ");
        largura = sc.nextInt();

        System.out.println("Informe o comprimento do terreno: ");
        comprimento = sc.nextInt();

        area = largura * comprimento;
        
        System.out.println("Digite o valor do m² em reais: R$");
        valorM2 = sc.nextDouble();
        valorTotal = valorM2 * area;
        System.out.println("O valor total do terreno é R$" + String.format("%.2f", valorTotal));

        sc.close();
    }

    void ex6(){
        Double distancia;
        Double litros;
        Double consumoMedio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância percorrida em km: ");
        distancia = sc.nextDouble();

        System.out.println("Digite o gasto com combustível em litros: ");
        litros = sc.nextDouble();

        consumoMedio = distancia / litros;

        System.out.println("O consumo médio é de: " + consumoMedio + " Km/L");
        sc.close();

    }

    void ex7(){
        String nome;
        Double nota1;
        Double nota2;
        Double nota3;
        Double nota4;
        Double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite a nota do 1º bimestre: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a nota do 2º bimestre: ");
        nota2 = sc.nextDouble();

        System.out.println("Digite a nota do 3º bimestre: ");
        nota3 = sc.nextDouble();

        System.out.println("Digite a nota do 4º bimestre: ");
        nota4 = sc.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media>=6){
            System.out.println("O aluno " + nome + " teve uma média de: " + media + " e está aprovado!");
        }   else{
                System.out.println("O aluno " + nome + " teve uma média de: " + media + " e está reprovado!");
            }
        sc.close();
    }

    void ex8(){
        double tempFahrenheit;
        double tempCelsius;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit °F para ser convertida em Celsius °C: ");
        tempFahrenheit = sc.nextDouble();

        tempCelsius = (tempFahrenheit - 32)/1.8;

        System.out.println("Temperatura em °F: " + String.format("%.2f", tempFahrenheit) + "°F");

        System.out.println("Temperatura em °C: " + String.format("%.2f", tempCelsius) + "°C");

        sc.close();
    }
}