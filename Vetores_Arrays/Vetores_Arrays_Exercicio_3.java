package Vetores_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores_Arrays_Exercicio_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cria um vetor de inteiros com 6 posições
        // Agora o vetor tem espaço para 6 números
        int[] numeros = new int[6];

        // Loop para preencher o vetor com os números digitados
        for(int i = 0; i < 6; i++){
            // Informa qual número o usuário deve digitar
            System.out.println("Digite o número " + (i + 1) + ":");

            // Lê o valor digitado e guarda no vetor
            numeros[i] = sc.nextInt();
        }

        // Exibe os elementos do vetor na ordem inversa
        System.out.println("Elementos na ordem inversa:");

        // Começa do último índice (length - 1) até o índice 0
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
