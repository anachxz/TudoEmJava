// ===== Funcoes_Exercicio_6 =====
package Funcoes; // Define o pacote

import java.util.Scanner; // Importa Scanner

public class Funcoes_Exercicio_6 { // Declara a classe do exercício 6

    public static String tamanhoTexto(String texto) { // Função (do jeito que está) apenas retorna o texto
        return texto; // Retorna o próprio texto recebido
    }

    public static void main(String[] args) { // Método principal
        Scanner input = new Scanner(System.in); // Cria Scanner
        System.out.println("Digite o texto: "); // Pede um texto ao usuário
        String texto = input.nextLine(); // Lê a linha inteira

        int caracter = texto.length(); // Calcula a quantidade de caracteres do texto

        System.out.println("O numero de caracteres do texto é: " + caracter); // Mostra o total de caracteres
    }
}
