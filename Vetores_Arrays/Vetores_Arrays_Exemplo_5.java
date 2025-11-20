package Vetores_Arrays;

import java.util.Scanner;

public class Vetores_Arrays_Exemplo_5 {
    public static void main(String[] args) {

        // Primeiro vetor com 5 valores
        int[] vetor1 = {1, 2, 3, 4, 5};

        // Segundo vetor com 5 valores (em ordem inversa)
        int[] vetor2 = {5, 4, 3, 2, 1};

        // Terceiro vetor que vai armazenar a soma dos dois anteriores
        int[] soma = new int[5];

        // Percorre os índices de 0 a 4
        for(int i = 0; i < 5; i++){
            // Soma o elemento do vetor1 com o mesmo índice do vetor2
            soma[i] = vetor1[i] + vetor2[i];
        }

        // Exibe todos os valores do vetor soma usando for-each
        for(int valor : soma){
            System.out.println(valor);
        }

    }
}
