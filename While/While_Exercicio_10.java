package While;

import java.util.Scanner;

public class While_Exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria o Scanner para ler a entrada do usuário

        int num1;
        int num2;

        System.out.println("Digite o primeiro numero: "); // Pede o primeiro número
        num1 = sc.nextInt(); // Lê o primeiro número digitado

        System.out.println("Digite o segundo numero: "); // Pede o segundo número
        num2 = sc.nextInt(); // Lê o segundo número digitado

        if (num1 == num2) { // Verifica se os dois números são iguais
            System.out.println("Os numeros são iguais. Não há numero entre eles");
        } else {
            System.out.println("Numeros entre " + num1 + " e " + num2 + " :"); // Exibe a frase inicial

            int menor = Math.min(num1, num2); // Descobre o menor número
            int maior = Math.max(num1, num2); // Descobre o maior número

            int atual = menor + 1; // Começa pelo número imediatamente após o menor

            while (atual < maior) { // Enquanto o número atual for menor que o maior, imprime
                System.out.println(atual); // Exibe o número atual do intervalo
                atual++; // Avança para o próximo número
            }
        }
    }
}
