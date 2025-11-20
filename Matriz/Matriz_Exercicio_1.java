package Matriz;

import java.util.Scanner;

public class Matriz_Exercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matriz 3x3 já inicializada com valores fixos
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Percorrendo a matriz linha por linha
        for (int linha = 0; linha < matriz.length; linha++) {
            // Percorrendo cada coluna da linha atual
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                // Imprime na mesma linha
                System.out.print(matriz[linha][coluna] + " ");
            }
            // Quebra de linha ao final de cada linha da matriz
            System.out.println();
        }
    }
}
