package Revisao;

import java.util.Scanner;

public class Controle_de_repeticao_com_break_e_continue_Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mensagem inicial explicando o objetivo do programa
        System.out.println("\nLer números até digitar -1\n");

        // Solicita o primeiro número antes de entrar no loop
        System.out.println("Digite um numero(-1 para sair): ");
        int numero = sc.nextInt(); // Lê o primeiro número digitado

        // Exibe o número digitado (se não for -1)
        System.out.println("Você digitou: " + numero);

        // Loop infinito controlado manualmente com break
        while (true) {

            // Solicita novo número
            System.out.println("Digite um numero(-1 para sair): ");
            numero = sc.nextInt(); // Lê o próximo número

            // Verifica se o número é -1 para encerrar
            if (numero == -1) {
                System.out.println("-1 encontrado. Encerrando com 'break'");
                break; // Sai do laço
            }

            // Caso não seja -1, apenas mostra o número digitado
            System.out.println("Você digitou: " + numero);
        }

    }
}
