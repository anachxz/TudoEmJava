package Switch_Case;
// Define o pacote onde essa classe está organizada dentro do projeto.

import java.util.Scanner;
// Importa a classe Scanner, usada para ler entradas digitadas pelo usuário.

public class Switch_Exercicio_2 {
    // Declara a classe pública que contém o programa.

    public static void main(String[] args) {
        // Método principal, onde o programa começa a rodar.

        Scanner sc = new Scanner(System.in);
        // Cria um objeto Scanner para capturar dados digitados pelo usuário.

        System.out.println("Digite dois numeros");
        // Exibe uma mensagem inicial pedindo dois números.

        System.out.println("Numero 1: ");
        // Exibe o rótulo para o primeiro número.

        System.out.println("Numero 2: ");
        // Exibe o rótulo para o segundo número.

        System.out.println("Insira o operador aritmético");
        // Pede para o usuário escolher qual operação deseja fazer.

        System.out.println("1- +");
        // Opção 1: soma.

        System.out.println("2- -");
        // Opção 2: subtração.

        System.out.println("3- *");
        // Opção 3: multiplicação.

        System.out.println("4- /");
        // Opção 4: divisão.

        double num1 = sc.nextDouble();
        // Lê o primeiro número digitado e armazena em num1.

        double num2 = sc.nextDouble();
        // Lê o segundo número digitado e armazena em num2.

        int opcao = sc.nextInt();
        // Lê a opção da operação aritmética escolhida pelo usuário.

        double soma = num1 + num2;
        // Calcula a soma e guarda o resultado.

        double subtracao = num1 - num2;
        // Calcula a subtração e guarda o resultado.

        double multiplicacao = num1 * num2;
        // Calcula a multiplicação e guarda o resultado.

        double divisao = num1 / num2;
        // Calcula a divisão e guarda o resultado.

        switch (opcao) {
            // Estrutura switch usada para decidir qual operação será exibida.

            case 1:
                // Caso o usuário tenha escolhido soma.
                System.out.println("A soma de " + num1 + " + " + num2 + " é igual" + soma);
                // Mostra o resultado da soma.
                break;
            // Encerra este case e impede que os outros sejam executados.

            case 2:
                // Caso tenha escolhido subtração.
                System.out.println("A subtração de " + num1 + " - " + num2 + " é igual a " + subtracao);
                break;

            case 3:
                // Caso tenha escolhido multiplicação.
                System.out.println("A multiplicação de " + num1 + " * " + num2 + " é igual a " + multiplicacao);
                break;

            case 4:
                // Caso tenha escolhido divisão.
                System.out.println("A divisão de " + num1 + " / " + num2 + " é igual a " + divisao);
                break;

            default:
                // Caso o usuário escolha um número que não seja 1, 2, 3 ou 4.
                System.out.println("Opção inválida!");
                // Mensagem de erro.
        }
    }
}
