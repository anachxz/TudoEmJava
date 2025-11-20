package Vetores_Arrays;

import java.util.Scanner;

public class Vetores_Arrays_Exercicio_1 {
    public static void main(String[] args) {

        // Vetor já inicializado com 5 valores
        int[] vetor = {1, 2, 3, 4, 5};

        // Mensagem inicial
        System.out.println(" Exibindo os valores de um vetor");

        // Percorrendo o vetor do índice 0 até o último índice
        for (int i = 0; i < vetor.length; i++) {
            // Exibe a posição atual e o valor armazenado nela
            System.out.println("Posição " + i + " : " + vetor[i]);
        }

        // Apenas separação visual no terminal
        System.out.println("\n------------------\n");

    }
}
