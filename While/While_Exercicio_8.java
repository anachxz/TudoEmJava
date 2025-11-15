package While;

import java.util.Scanner;

public class While_Exercicio_8 {
    private static Object x; // Variável não utilizada, mas não vou mexer porque você pediu só comentário

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria o Scanner para ler dados do usuário
        int num; // Número que o usuário vai digitar para gerar a tabuada
        int i = 1; // Contador inicial da tabuada, começando em 1

        System.out.println("Digite um numero inteiro para realizar sua tabuada: "); // Pede o número
        num = sc.nextInt(); // Lê o número digitado

        while (i <= 10) { // Repete enquanto i for menor ou igual a 10
            System.out.println("===TABUADA==="); // Título exibido em cada repetição
            System.out.println(num + " x " + i + " = " + (num * i)); // Mostra a multiplicação

            i++; // Incrementa o contador para avançar a tabuada
        }
    }
}
