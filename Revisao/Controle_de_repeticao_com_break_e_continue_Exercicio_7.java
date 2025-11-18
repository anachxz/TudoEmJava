package Revisao;

import java.util.Scanner;

public class Controle_de_repeticao_com_break_e_continue_Exercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Começamos a contagem a partir de 1
        int i = 1;

        // Contador para saber quantos números divisíveis por 4 já foram impressos
        int contador = 0;

        // Loop infinito, será interrompido pelo break
        while (true) {

            // Verifica se o número atual é múltiplo de 4
            if (i % 4 == 0) {
                System.out.println(i); // Imprime o número
                contador++; // Conta quantos já foram impressos
            }

            // Se já imprimimos 10 números múltiplos de 4, encerramos o loop
            if (contador == 10) {
                break;
            }

            // Incrementa o número para a próxima verificação
            i++;
        }
    }
}
