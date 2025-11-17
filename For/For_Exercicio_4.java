package For;

import java.util.Scanner;

public class For_Exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Título do exercício
        System.out.println("\nCálculo de média de 10 números: ");

        // Variável que acumula a soma dos números digitados
        double soma = 0;

        // Loop que roda 10 vezes, pedindo um número em cada repetição
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número: ");
            double numero = sc.nextDouble(); // Lê o número digitado
            soma += numero; // Adiciona o número à soma total
        }

        // Calcula a média dividindo a soma por 10
        double media = soma / 10;

        // Exibe o resultado final
        System.out.println("Média: " + media);
    }
}
