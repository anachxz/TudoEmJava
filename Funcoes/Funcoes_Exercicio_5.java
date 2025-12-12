// ===== Funcoes_Exercicio_5 =====
package Funcoes; // Define o pacote

import java.util.Scanner; // Importa Scanner

public class Funcoes_Exercicio_5 { // Declara a classe do exercício 5

    public static int maior(int a, int b) { // Função que retorna o maior entre dois números
        if (a <= b) return b; // Se a for menor ou igual, retorna b
        else return a; // Senão, retorna a
    }

    public static void main(String[] args) { // Método principal
        Scanner input = new Scanner(System.in); // Cria Scanner

        System.out.println("Digite um número a: "); // Pede o número a
        int a = input.nextInt(); // Lê a

        System.out.println("Digite um número b: "); // Pede o número b
        int b = input.nextInt(); // Lê b

        int resultado = maior(a, b); // Chama a função para descobrir o maior

        System.out.println("O maior número é: " + resultado); // Exibe o maior número
    }
}
