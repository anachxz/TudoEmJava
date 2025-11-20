package Matriz;

public class Matriz_Exercicio_5 {
    public static void main(String[] args) {

        // Matriz original 3x2
        int[][] matriz = {
                {1, 2},
                {4, 5},
                {6, 7},
        };

        System.out.println("Matriz transposta:");

        // Transposta será 2x3 (colunas viram linhas)
        for (int j = 0; j < 2; j++) {       // percorre colunas
            for (int i = 0; i < 3; i++) {   // percorre linhas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
