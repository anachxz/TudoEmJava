
package Listas; // Define o pacote onde a classe está localizada

import java.util.ArrayList;      // Importa a classe ArrayList para listas dinâmicas
import java.util.Collections;    // Importa a classe Collections para operações como max() e min()
import java.util.Scanner;        // Importa a classe Scanner para entrada de dados via teclado

public class Listas_Exercicio_4 {
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar entrada do usuário (não usado neste exemplo)
        Scanner scanner = new Scanner(System.in);

        // Cria uma lista dinâmica para armazenar números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adiciona valores fixos à lista
        numeros.add(10);
        numeros.add(25);
        numeros.add(7);
        numeros.add(40);
        numeros.add(13);

        // Obtém o tamanho da lista (quantidade de elementos)
        int tamanho = numeros.size();
        System.out.println("O número de elementos na lista é: " + tamanho);

        // Usa Collections.max() para encontrar o maior valor na lista
        int maiorValor = Collections.max(numeros);
        System.out.println("O maior valor na lista é: " + maiorValor);

        // Usa Collections.min() para encontrar o menor valor na lista
        int menorValor = Collections.min(numeros);
        System.out.println("O menor valor na lista é: " + menorValor);

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
