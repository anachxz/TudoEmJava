package Vetores_Arrays;

import java.util.Scanner;

public class Vetores_Arrays_Exemplo_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criação do vetor que vai armazenar 10 números digitados pelo usuário
        int[] numeros = new int[10];

        // Variável para contar quantos números pares foram digitados
        int pares = 0;

        // Loop para preencher o vetor
        for(int i = 0; i < 10; i++){
            // Pede ao usuário o número da vez
            System.out.println("Digite o numero " + (i + 1) + " :");

            // Armazena o número digitado no vetor
            numeros[i] = sc.nextInt();

            // Verifica se o número é par
            if(numeros[i] % 2 == 0){
                // Se for par, incrementa o contador
                pares++;
            }
        }

        // Exibe quantos números pares foram digitados
        System.out.println("Quantidade de numeros pares: " + pares);

    }
}
