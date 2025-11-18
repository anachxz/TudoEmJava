package Revisao;

import java.util.Scanner;

public class Controle_de_repeticao_com_break_e_continue_Exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pede ao usuário um número entre 1 e 10 que será ignorado no loop
        System.out.println("\nDigite um numero de 1 a 10 para ser ignorado: ");

        int ignorado = sc.nextInt();

        // Loop de 1 a 10 imprimindo todos os números, exceto o escolhido
        for (int i = 1; i <= 10; i++) {

            // Quando o número atual for o mesmo digitado pelo usuário, pula essa iteração
            if (i == ignorado) {
                continue; // "continue" faz pular o resto do loop e ir direto pro próximo i
            }

            // Imprime o número atual
            System.out.println(i);
        }
    }
}
