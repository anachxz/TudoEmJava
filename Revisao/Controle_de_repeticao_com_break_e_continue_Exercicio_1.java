package Revisao;

import java.util.Scanner;

public class Controle_de_repeticao_com_break_e_continue_Exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exibe o objetivo do programa
        System.out.println("\nInterromper contagem de 1 a 100 " +
                "ao encontrar um multiplo de 7\n");

        // Laço que vai de 1 até 100
        for (int i = 1; i <= 100; i++) {

            // Verifica se o número atual é múltiplo de 7
            if (i % 7 == 0) {
                System.out.println("Número múltiplo de 7 encontrado: " + i);
                break; // Interrompe o laço imediatamente
            }

            // Caso não seja múltiplo de 7, apenas imprime o número
            System.out.println(i);
        }
    }
}
