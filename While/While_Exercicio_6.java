package While;
// Define o pacote onde esta classe está localizada.

import java.util.Scanner;
// Importa a classe Scanner para permitir leitura de dados digitados pelo usuário.

public class While_Exercicio_6 {
    // Declaração da classe do exercício.

    public static void main(String[] args) {
        // Método principal do programa.

        Scanner sc = new Scanner(System.in);
        // Cria um objeto Scanner para capturar a entrada do usuário.

        int num = 0;
        // Variável que armazenará cada número digitado pelo usuário.

        int contador = 0;
        // Contador que registra quantos números positivos foram digitados.

        System.out.println("Digite um numero inteiro: (0 para encerrar)");
        // Mensagem inicial explicando como encerrar o programa.

        num = sc.nextInt();
        // Lê o primeiro número informado.

        while (num != 0) {
            // O loop será executado enquanto o usuário não digitar 0.

            if (num > 0) {
                // Verifica se o número digitado é positivo.

                contador++;
                // Se for positivo, incrementa o contador.
            }

            System.out.println("Digite um numero inteiro: (0 para encerrar)");
            // Solicita um novo número dentro do loop.

            num = sc.nextInt();
            // Lê o próximo número informado.
        }

        System.out.println("Quantidade de numeros postivos :" + contador);
        // Exibe quantos números positivos foram digitados antes do encerramento.
    }
}
