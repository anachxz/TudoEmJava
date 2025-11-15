package While;

import java.util.Scanner;

public class While_Exercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Criando o Scanner para ler o número digitado pelo usuário
        System.out.println("Digite um numero: "); // Solicita ao usuário um número para calcular o fatorial
        int num = sc.nextInt(); // Recebe o número informado pelo usuário

        int fatorial = 1; // Variável que vai acumular o resultado do fatorial
        int i = 1; // Contador inicial, começando em 1

        while (i <= num) { // Loop que vai multiplicar até chegar no número escolhido
            fatorial = fatorial * i; // Multiplica o acumulado pelo valor atual de i
            i += 1; // Incrementa o contador
        }

        System.out.println("Fatorial de " + num + " é " + fatorial); // Exibe o resultado final para o usuário
    }
}
