
package Listas; // Define o pacote onde a classe está localizada

import java.util.ArrayList; // Importa a classe ArrayList para trabalhar com listas dinâmicas
import java.util.Scanner;   // Importa a classe Scanner para entrada de dados via teclado

public class Listas_Exercicio_2 {
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Cria uma lista dinâmica para armazenar números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adiciona valores fixos à lista
        numeros.add(5);
        numeros.add(10);
        numeros.add(20);
        numeros.add(15);
        numeros.add(30);

        // Variável para armazenar a soma total dos números
        int somaTotal = 0;

        // Percorre cada número da lista e acumula na somaTotal
        for (int num : numeros) {
            somaTotal += num;
        }

        // Exibe a soma total no console
        System.out.println("A soma dos números é: " + somaTotal);

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
