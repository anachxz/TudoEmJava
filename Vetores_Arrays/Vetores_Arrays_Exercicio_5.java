package Vetores_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Vetores_Arrays_Exercicio_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Vetor inicial com valores fixos
        int[] vetor = {2, 4, 6, 8, 10};

        // Variável que vai guardar o número informado pelo usuário
        int multiplica = 0;

        // Pede ao usuário um número para multiplicar todos os elementos do vetor
        System.out.println("Digite um número para multiplicar: ");
        multiplica = sc.nextInt();

        // Percorre todo o vetor multiplicando cada elemento pelo número digitado
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] *= multiplica;  // mesma coisa que: vetor[i] = vetor[i] * multiplica;
        }

        // Exibe o resultado após a multiplicação
        System.out.println("Resultado da multiplicação:");
        for (int valor : vetor) {
            System.out.println(valor);
        }
    }
}
