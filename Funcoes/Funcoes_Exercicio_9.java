// ===== Funcoes_Exercicio_9 =====
package Funcoes; // Define o pacote

import java.util.Scanner; // Importa Scanner

public class Funcoes_Exercicio_9 { // Declara a classe do exercício 9

    public static void contarAte(int n){ // Função que imprime os números de 1 até n
        for (int i = 1; i <= n; i++){ // Laço que começa em 1 e vai até n
            System.out.println(i); // Imprime o valor atual de i
        }
    }

    public static void main(String[] args) { // Método principal
        Scanner input = new Scanner(System.in); // Cria Scanner

        System.out.println("Digite um numero: "); // Pede o número
        int numero = input.nextInt(); // Lê o número digitado

        contarAte(numero); // Chama a função para imprimir de 1 até o número
    }
}
