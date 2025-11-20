package Matriz;

import java.util.Scanner;

public class Matriz_Exercicio_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matriz 2x2 a ser preenchida
        int[][] matriz = new int[2][2];

        double soma = 0;   // acumula os valores
        double total = 0;  // contabiliza a quantidade de elementos

        // Preenchimento da matriz pelo usuário
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {

                System.out.print("Digite um valor [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        System.out.println("Matriz preenchida:");

        // Percorre toda a matriz
        for (int[] linha : matriz) {
            for (int valor : linha) {

                // Imprime o valor
                System.out.print(valor + " ");

                // Soma e conta elementos
                soma += valor;
                total++;
            }
            System.out.println();
        }

        // Cálculo da média
        double media = soma / total;

        System.out.println("Média dos valores da matriz: " + media);
    }
}
