package While;
// Define o pacote onde esta classe está organizada.

import java.util.Scanner;
// Importa a classe Scanner para permitir leitura de dados pelo teclado.

public class While_Exemplo_1 {
    // Declaração da classe pública que contém o exemplo.

    public static void main(String[] args) {
        // Método principal onde o programa começa.

        Scanner sc = new Scanner(System.in);
        // Cria um objeto Scanner (mesmo sem usar, ele está aqui como estrutura padrão do exercício).

        System.out.println("\n1. Contar de 1 até o 5 com while\n");
        // Mensagem indicando o primeiro exemplo.

        int contador = 1;
        // Variável de controle que começará em 1.

        while (contador <= 5) {
            // Loop while que será executado enquanto contador for menor ou igual a 5.

            System.out.println("Contador: " + contador);
            // Exibe o valor atual do contador.

            contador++;
            // Incrementa o contador em 1 a cada repetição.
        }

        System.out.println("\n2. Contagem regressiva de 5 até o 1 com while\n");
        // Mensagem indicando o segundo exemplo.

        int numero = 5;
        // Variável que começa em 5 para realizar a contagem regressiva.

        while (numero >= 1) {



            System.out.println("Número: " + numero);
            // Exibe o número atual na contagem regressiva.

            numero--;
            // Decrementa o número, aproximando da condição final.
        }

        System.out.println("\n3. Soma dos número de 1 a 10 com while\n");
        // Mensagem indicando o terceiro exemplo.

        int soma = 0;
        // Variável acumuladora que armazenará a soma.

        int i = 1;
        // Variável de controle iniciando em 1.

        while (i <= 10) {
            // Loop se repetirá enquanto i for menor ou igual a 10.

            soma += i;
            // Adiciona o valor atual de i ao acumulador 'soma'.

            i++;
            // Incrementa i em 1 a cada ciclo.
        }

        System.out.println(" A soma de 1 até 10 é : " + soma);
        // Exibe o resultado final da soma dos números de 1 a 10.
    }
}
