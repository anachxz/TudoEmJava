package Matriz;

public class Matriz_Exercicio_6 {
    public static void main(String[] args) {

        // Matriz 3x3 padrão
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Troca das linhas 0 e 2
        int[] temp = matriz[0];
        matriz[0] = matriz[2];
        matriz[2] = temp;

        System.out.println("Matriz após troca de linhas:");

        // Impressão da matriz modificada
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
