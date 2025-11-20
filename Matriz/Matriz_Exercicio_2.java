package Matriz;

import java.util.Scanner;

public class Matriz_Exercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matriz 2x2 vazia
        int[][] matriz = new int[2][2];

        // Preenchimento manual
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {

                // Solicita valor ao usuário
                System.out.print("Digite um valor [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        // Impressão da matriz preenchida
        System.out.println("Matriz preenchida:");

        // For-each para percorrer linhas
        for (int[] linha : matriz) {

            // Percorre cada elemento da linha
            for (int valor : linha) {
                // Corrigido: "print" ao invés de "println" para não quebrar linha a cada número
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
