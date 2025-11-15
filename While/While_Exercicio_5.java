package While;
// Define o pacote onde a classe está organizada dentro do projeto.

import java.util.Scanner;
// Importa a classe Scanner, usada para ler entradas digitadas pelo usuário.

public class While_Exercicio_5 {
    // Declaração da classe pública do exercício.

    public static void main(String[] args) {
        // Método principal onde o programa inicia.

        Scanner sc = new Scanner(System.in);
        // Cria um objeto Scanner para capturar os números digitados no teclado.

        int num = 0;
        // Variável que armazena o número atual digitado pelo usuário. Inicia em 0 apenas como padrão.

        int soma = 0;
        // Acumulador que somará todos os números válidos digitados.

        int quantidade = 0;
        // Contador que registra quantos números foram digitados (exceto o -1).

        System.out.println("Digite um número inteiro (-1 para encerrar): ");
        // Pede ao usuário um número e explica a condição de parada.

        num = sc.nextInt();
        // Lê o primeiro número informado.

        while (num != -1) {
            // Loop que continuará rodando enquanto o número digitado for diferente de -1.

            System.out.println("Digite um número inteiro (-1 para encerrar): ");
            // Solicita um novo número para o usuário.

            num = sc.nextInt();
            // Lê o número digitado agora.

            if (num != -1) {
                // Verifica novamente se o número NÃO é o valor de encerramento.

                soma += num;
                // Soma o número ao acumulador.

                quantidade++;
                // Incrementa a contagem de números válidos.
            }
        }

        if (quantidade > 0) {
            // Caso tenha sido digitado pelo menos um número válido:

            double media = (double) soma / quantidade;
            // Calcula a média convertendo soma para double para garantir precisão.

            System.out.println("Média dos numeros: " + media);
            // Exibe a média final.
        } else {
            // Caso nenhum número válido tenha sido digitado:

            System.out.println("Nenhum numero encontrado");
            // Exibe uma mensagem informando a ausência de valores.
        }
    }
}
