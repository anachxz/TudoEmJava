package Vetores_Arrays;

import java.util.Scanner;

public class Vetores_Arrays_Exemplo_4 {
    public static void main(String[] args) {

        // Vetor já preenchido com valores fixos
        int[] vetor = { 7, 3, 5, 7, 2, 7, 8, 1, 7, 6 };

        // Variável que vai contar quantas vezes o número 7 aparece
        int contador = 0;

        // For-each percorre cada valor do vetor
        for(int valor : vetor){
            // Se o valor atual for igual a 7, aumenta o contador
            if(valor == 7){
                contador++;
            }
        }

        // Exibe quantas vezes o número 7 aparece
        System.out.println(" O número 7 aparece " + contador + " vezes");

    }
}
