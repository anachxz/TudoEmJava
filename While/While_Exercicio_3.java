package While;
// Define o pacote onde esta classe está organizada no projeto.

import java.util.Scanner;
// Importa a classe Scanner, usada para capturar entradas do usuário pelo teclado.

public class While_Exercicio_3 {
    // Declaração da classe pública que contém o exercício.

    public static void main(String[] args) {
        // Método principal onde o programa começa a ser executado.

        Scanner sc = new Scanner(System.in);
        // Cria um objeto Scanner para ler valores digitados pelo usuário.

        int num;
        // Declara a variável que irá armazenar o número digitado pelo usuário.

        System.out.println("Digite um número inteiro (0 para encerrar): ");
        // Exibe a primeira solicitação de número.

        num = sc.nextInt();
        // Lê o número digitado e armazena em 'num'.

        while (num != 0) {
            // O loop será executado enquanto o número for diferente de 0.

            if (num < 0) {
                // Verifica se o número digitado é negativo.

                System.out.println("Número negativo inválido!");
                // Se for negativo, mostra mensagem de erro.
            } else {
                System.out.println("Você digitou: " + num);
                // Se for positivo, mostra o número digitado.
            }

            System.out.println("Digite um número inteiro (0 para encerrar): ");
            // Solicita um novo número do usuário.

            num = sc.nextInt();
            // Atualiza o valor de 'num' para continuar ou encerrar o loop.
        }

        System.out.println("Encerrado.");
        // Mensagem final informando que o programa terminou.
    }
}
