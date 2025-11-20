package Matriz;

import java.util.Scanner;

public class Matriz_Exercicio_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matriz 3x4 com valores fixos
        int[][] matriz = {
                {10, 20, 30, 40},
                {10, 20, 30, 40},
                {10, 20, 30, 40},
        };

        int pares = 0; // contador de números pares

        // Percorre todas as linhas
        for (int[] linha : matriz) {
            // Percorre os valores da linha atual
            for (int valor : linha) {

                // Se for par, aumenta contador
                if (valor % 2 == 0) {
                    pares++;
                }
            }
        }

        // Corrigido: imprimir apenas após contar tudo
        System.out.println("Quantidade de números pares: " + pares);
    }
}
