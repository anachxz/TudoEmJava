package Revisao;

import java.util.Scanner;

public class Controle_de_repeticao_com_break_e_continue_Exemplo_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EXEMPLO 1 — for com break e continue
        System.out.println("\n1. Laço for com break e continue\n");

        for (int i = 1; i <= 10; i++) {

            // Quando o valor for 5, apenas pula essa iteração
            if (i == 5) {
                System.out.println("Número 5 pulando com 'continue'");
                continue; // volta para o início do for
            }

            // Quando o valor for 8, interrompe totalmente o laço
            if (i == 8) {
                System.out.println("Número 8 encontrado. Parando com 'break'");
                break; // sai do for
            }

            System.out.println("Número: " + i); // imprime valores normais
        }

        // EXEMPLO 2 — while com break e continue
        System.out.println("\n2. Laço while com break e continue\n");

        int contador = 0;
        while (contador < 10) {
            contador++; // incrementa primeiro

            // Se o número for par, ignora o restante do corpo do while
            if (contador % 2 == 0) {
                continue;
            }

            // Se o valor for 7, para o loop
            if (contador == 7) {
                System.out.println("Número 7 encontrado. Parando com 'break'");
                break;
            }

            System.out.println("Número ímpar: " + contador);
        }

        // EXEMPLO 3 — do-while com break e continue
        System.out.println("\n3. Laço do-while com break e continue\n");

        int numero = 0;
        do {
            numero++;

            // Se for 3, pula a impressão
            if (numero == 3) {
                System.out.println("Número 3 ignorado com 'continue'");
                continue;
            }

            // Se for 6, encerra o loop
            if (numero == 6) {
                System.out.println("Número 6 encontrado. Parando com 'break'");
                break;
            }

            System.out.println("Número: " + numero);

        } while (numero < 10); // condição do do-while
    }
}
