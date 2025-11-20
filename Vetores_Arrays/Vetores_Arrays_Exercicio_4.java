package Vetores_Arrays;

import java.util.Scanner;

public class Vetores_Arrays_Exercicio_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cria um vetor de inteiros com 6 posições
        // Agora o vetor tem espaço para 6 números
        int[] numeros = new int[5];
        double soma = 0;


        // Loop para preencher o vetor com os números digitados
        for(int i = 0; i < 5; i++){
            // Informa qual número o usuário deve digitar
            System.out.println("Digite o número " + (i + 1) + ":");

            // Lê o valor digitado e guarda no vetor
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }
        double media = soma / 5;
        System.out.println("A média é "+media);

        

        }
    }

