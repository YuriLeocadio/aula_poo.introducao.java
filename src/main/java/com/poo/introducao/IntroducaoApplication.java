package com.poo.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroducaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroducaoApplication.class, args);

        LimpaTerminal.limpa_terminal();
        Lista02 lista = new Lista02();
        lista.ex8();
    }

    static class LimpaTerminal {
        static void limpa_terminal() {
            // Imprimir 50 linhas em branco para "limpar" o terminal
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }
}