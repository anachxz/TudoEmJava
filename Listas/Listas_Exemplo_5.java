package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Listas_Exemplo_5 {
    public static void main(String[] args) {

        // Lista de números inteiros
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(23, 1, 45, 6, 12));

        // Lista de frutas, com repetição de "maça"
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("banana", "maça", "cereja", "maça", "damasco"));

        System.out.println("=== Lista original de números ===");
        System.out.println(numeros);

        // Ordenação crescente (menor → maior)
        Collections.sort(numeros);
        System.out.println("\nNúmeros ordenados (crescente): " + numeros);

        System.out.println("\n=== Lista original de frutas ===");
        System.out.println(frutas);

        // Ordenação alfabética padrão
        Collections.sort(frutas);
        System.out.println("\nFrutas ordenadas (ordem alfabética): " + frutas);

        // Ordenação decrescente utilizando reverseOrder()
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("\nNúmeros ordenados (decrescente): " + numeros);

        Collections.sort(frutas, Collections.reverseOrder());
        System.out.println("\nFrutas ordenadas (decrescente): " + frutas);

        System.out.println("\n=== Invertendo a ordem (reverse) ===");

        // Inverte a lista sem ordenar (somente reverte a ordem atual)
        Collections.reverse(numeros);
        System.out.println("Números após reverse(): " + numeros);

        Collections.reverse(frutas);
        System.out.println("Frutas após reverse(): " + frutas);

        System.out.println("\n=== Contando ocorrências ===");

        // Contador de quantas vezes "banana" aparece
        int ocorrenciasBanana = 0;
        for (String fruta : frutas) {
            if (fruta.equals("banana")) {
                ocorrenciasBanana++;
            }
        }
        System.out.println("Ocorrências de 'banana': " + ocorrenciasBanana);

        // Contador de quantas vezes o número 6 aparece
        int ocorrenciasNumeros6 = 0;
        for (int num : numeros) {
            if (num == 6) {
                ocorrenciasNumeros6++;
            }
        }
        System.out.println("Ocorrências do número 6: " + ocorrenciasNumeros6);

        System.out.println("\n=== Buscando índices ===");

        // indexOf retorna o índice da primeira ocorrência
        int indiceBanana = frutas.indexOf("banana");

        if (indiceBanana != -1) {
            System.out.println("Índice da primeira banana: " + indiceBanana);
        } else {
            System.out.println("'banana' não está na lista.");
        }

        // Busca o índice do número 23
        int indice23 = numeros.indexOf(23);

        if (indice23 != -1) {
            System.out.println("Índice do número 23: " + indice23);
        } else {
            System.out.println("Número 23 não está na lista.");
        }
    }
}
