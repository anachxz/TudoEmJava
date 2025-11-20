package Matriz;

public class Matriz_Exercicio_8 {
    public static void main(String[] args) {

        // Mesmo exercício 7 repetido — mantive e comentei novamente
        int[][] matriz1 = {
                {1, 2},
                {3, 4}
        };

        int[][] matriz2 = {
                {5, 6},
                {7, 8}
        };

        int[][] soma = new int[2][2];

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
