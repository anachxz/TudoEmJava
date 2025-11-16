package Do_While;

import java.util.Scanner;

public class Do_While_Exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;          // Variável para armazenar cada número digitado
        int quantidade = 0;  // Conta quantos números válidos foram digitados
        int soma = 0;        // Soma todos os números digitados

        // Estrutura do-while para continuar lendo enquanto não for digitado -1
        do {
            System.out.println("Digite um numero (-1 para sair): ");
            numero = sc.nextInt(); // Lê o número digitado

            if (numero != -1) {  // Se não for o número de saída...
                soma += numero;   // Soma o número à variável "soma"
                quantidade++;     // Aumenta a quantidade de números válidos
            }

        } while (numero != -1); // Para quando o usuário digitar -1

        // Depois do loop, verifica se foi digitado pelo menos um número válido
        if (quantidade > 0) {
            double media = (double) soma / quantidade; // Calcula a média
            System.out.println("Média: " + media);     // Exibe a média
        } else {
            System.out.println("Nenhum número encontrado"); // Caso nenhum número tenha sido digitado
        }
    }
}
