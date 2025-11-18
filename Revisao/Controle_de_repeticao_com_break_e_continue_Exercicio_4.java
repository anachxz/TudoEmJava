package Revisao;

import java.util.Scanner;

public class Controle_de_repeticao_com_break_e_continue_Exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mensagem inicial explicando o objetivo do programa
        System.out.println("\nSomar todos os numeros até digitar um negativo\n");

        int numero;   // Variável para armazenar cada número digitado
        int soma = 0; // Acumulador da soma dos números positivos

        // Laço infinito controlado com break
        while (true) {
            System.out.println("Digite um numero (negativo para começar a soma): ");
            numero = sc.nextInt(); // Lê o número digitado

            // Se for negativo, encerra o loop
            if (numero < 0) {
                break; // Interrompe o laço imediatamente
            }

            // Caso seja positivo ou zero, soma ao acumulador
            soma += numero;
        }

        // Exibe o resultado final
        System.out.println("Soma de todos os números: " + soma);
    }
}
