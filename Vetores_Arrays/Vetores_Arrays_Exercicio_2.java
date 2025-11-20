package Vetores_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores_Arrays_Exercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cria um vetor de inteiros com 5 posições
        // Aqui ainda não tem valores, só espaço reservado
        int[] numeros = new int[5];

        // Loop para preencher o vetor
        for(int i = 0; i < 5; i++){
            // Mostra qual número o usuário deve digitar
            System.out.println("Digite o número " + (i + 1) + ":");

            // Lê o valor digitado e armazena na posição i do vetor
            numeros[i] = sc.nextInt();
        }

        // Exibe o vetor completo no formato [x, y, z...]
        // Arrays.toString transforma o vetor em texto facilmente
        System.out.println("\nVocê digitou esses números: " + Arrays.toString(numeros));
    }
}
