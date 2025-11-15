package While;
// Define o pacote onde esta classe está organizada dentro do projeto.

import java.util.Scanner;
// Importa a classe Scanner (mesmo sem usar, fica como padrão em exercícios de entrada).

public class While_Exercicio_1 {
    // Declaração da classe principal do exercício.

    public static void main(String[] args) {
        // Método principal – ponto de início da execução do programa.

        Scanner sc = new Scanner(System.in);
        // Cria um objeto Scanner (não é usado, mas faz parte da estrutura padrão do exercício).

        System.out.println("\nImprimir todos os numeros de 1 até 100\n");
        // Exibe uma mensagem informando o objetivo do exercício.

        int contador = 1;
        // Variável de controle que começa em 1.

        while (contador <= 100) {
            // Loop while que será executado enquanto 'contador' for menor ou igual a 100.

            System.out.println("Contador: " + contador);
            // Exibe o valor atual do contador.

            contador++;
            // Incrementa o contador para avançar para o próximo número.
        }
    }
}
