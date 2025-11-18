package Revisao;

import java.util.Scanner;

public class Controle_de_repeticao_com_break_e_continue_Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mensagem inicial explicando o que será exibido
        System.out.println("\nImprimir números pares de 1 a 20 (inclusive)\n");

        // Laço de 1 até 20
        for (int i = 1; i <= 20; i++) {

            // Se o número for par, imprime e usa 'continue' para pular o resto do laço
            if (i % 2 == 0) {
                System.out.println("Número par encontrado: " + i);
                continue;
            }

            // Se não for par (ou seja, for ímpar), imprime como ímpar
            System.out.println("Número ímpar: " + i);
        }
    }
}
