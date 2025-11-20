package Matriz;

public class Matriz_Exercicio_7 {
    public static void main(String[] args) {

        // Matriz 1
        int[][] matriz1 = {
                {1, 2},
                {3, 4}
        };

        // Matriz 2
        int[][] matriz2 = {
                {5, 6},
                {7, 8}
        };

        // Matriz que recebe a soma
        int[][] soma = new int[2][2];

        // Soma elemento a elemento
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz soma:");

        for (int[] linha : soma) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
