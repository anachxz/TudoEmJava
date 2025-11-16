package Do_While;

import java.util.Scanner;

public class Do_While_Exemplo_1 {
    public static void main(String[] args) {

        System.out.println("\n Exemplo 1: Conta de 1 até 5 com do-while\n");

        int contador = 1; // Inicializa o contador começando em 1
        do {
            System.out.println("Contando: " + contador); // Exibe o valor atual do contador
            contador++; // Incrementa o contador
        } while (contador <= 5); // Repete enquanto contador for menor ou igual a 5

        System.out.println("\n Exemplo 2: Menu simples que repete até o usuário digitar 0\n");
        Scanner entrada = new Scanner(System.in); // Scanner para ler a escolha do usuário

        int opcao; // Variável que armazenará a opção digitada

        do {
            System.out.println("===MENU==="); // Exibe o menu
            System.out.println("1- Opção 1");
            System.out.println("2- Opção 2");
            System.out.println("0- Sair");
            System.out.println("Escolha uma opção: ");
            opcao = entrada.nextInt(); // Lê a opção informada pelo usuário

            if (opcao == 1) { // Caso escolha 1
                System.out.println("Você escolheu a opção 1");

            } else if (opcao == 2) { // Caso escolha 2
                System.out.println("Você escolhe a opção 2");

            } else if (opcao != 0) { // Caso escreva algo diferente de 0, 1 ou 2
                System.out.println("Opção invalida");
            }

        } while (opcao != 0); // Repete enquanto a opção for diferente de 0 (sair)

        System.out.println("Programa finalizado");

        System.out.println("\n Exemplo 3: Validar entrada até o usuário digitar número positivo\n");
        Scanner entrada2 = new Scanner(System.in); // Novo scanner para outra leitura
        int numero; // Variável que guardará o número digitado

        do {
            System.out.println("Digite um numero positivo: "); // Pede um número positivo
            numero = entrada2.nextInt(); // Lê o número

            if (numero < 0) { // Se for negativo, avisa que é inválido
                System.out.println("Número invalido");
            }

        } while (numero < 0); // Repete até o usuário digitar um número positivo

        System.out.println("Número aceito: " + numero); // Exibe o número válido inserido

    }

}
