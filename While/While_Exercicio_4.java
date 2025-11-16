package While;
// Define o pacote onde esta classe está localizada dentro do projeto.

import java.util.Scanner;
// Importa a classe Scanner para permitir a leitura de dados digitados pelo usuário.

public class While_Exercicio_4 {
    // Declaração da classe principal do exercício.

    public static void main(String[] args) {
        // Método principal – onde o programa começa sua execução.

        Scanner sc = new Scanner(System.in);
        // Cria um objeto Scanner para capturar valores digitados pelo teclado.

        int num;
        // Declara a variável que armazenará o número digitado pelo usuário.

        System.out.println("Digite um número inteiro (Digite um negativo para encerrar): ");
        // Exibe a mensagem inicial explicando a condição de parada.

        num = sc.nextInt();
        // Lê o primeiro número informado pelo usuário.

        while (num >= 0) {
            // O loop continua enquanto o número for positivo.

            System.out.println("Você digitou: " + num);
            // Exibe o número positivo digitado.

            num = sc.nextInt();
            // Lê o próximo número informado pelo usuário.

            if (num < 0) {
                // Verifica se o número digitado agora é negativo.

                System.out.println("Você digitou " + num + " ,logo, encerrado!");
                // Se for negativo, exibe a mensagem de encerramento.
            }
        }
    }
}
