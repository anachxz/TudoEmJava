package Switch_Case;
// Define o pacote onde a classe está organizada.

import java.util.Scanner;
// Importa a classe Scanner, usada para ler a entrada do usuário pelo teclado.

public class Switch_Exercicio_1 {
    // Declaração da classe pública que contém o programa.

    public static void main(String[] args) {
        // Método principal: onde o programa começa a executar.

        Scanner sc = new Scanner(System.in);
        // Cria um objeto Scanner para capturar entradas digitadas pelo usuário.

        System.out.println("Escolha o dia da semana: ");
        // Exibe uma mensagem inicial pedindo para o usuário escolher um dia.

        System.out.println("1 - Domingo");
        // Mostra a opção 1.

        System.out.println("2 - Segunda");
        // Mostra a opção 2.

        System.out.println("3 - Terça");
        // Mostra a opção 3.

        System.out.println("4 - Quarta");
        // Mostra a opção 4.

        System.out.println("5 - Quinta");
        // Mostra a opção 5.

        System.out.println("6 - Sexta");
        // Mostra a opção 6.

        System.out.println("7 - Sábado");
        // Mostra a opção 7.

        System.out.println("Digite o número da opção: ");
        // Pede para o usuário digitar um número correspondente ao dia escolhido.

        int opcao = sc.nextInt();
        // Lê o número digitado e armazena na variável 'opcao'.

        switch (opcao) {
            // Estrutura switch usada para verificar qual valor 'opcao' recebeu.

            case 1:
                // Se 'opcao' for 1, executa esse bloco.
                System.out.println("Você escolheu Domingo");
                // Exibe a escolha.
                break;
            // Encerra o case.

            case 2:
                System.out.println("Você escolheu Segunda");
                break;

            case 3:
                System.out.println("Você escolheu Terça");
                break;

            case 4:
                System.out.println("Você escolheu Quarta");
                break;

            case 5:
                System.out.println("Você escolheu Quinta");
                break;

            case 6:
                System.out.println("Você escolheu Sexta");
                break;

            case 7:
                System.out.println("Você escolheu Sábado");
                break;

            default:
                // Caso nenhum dos valores anteriores seja escolhido.
                System.out.println("Opção invalida");
                // Mensagem para opção inválida.
        }
    }
}
