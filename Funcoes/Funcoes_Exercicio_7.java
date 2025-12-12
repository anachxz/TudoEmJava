// ===== Funcoes_Exercicio_7 =====
package Funcoes; // Define o pacote

import java.util.Scanner; // Importa Scanner

public class Funcoes_Exercicio_7 { // Declara a classe do exercício 7

    public static String inverterTexto(String texto) { // Função que inverte um texto
        String invertido = ""; // Começa com uma string vazia

        for (int i = texto.length() - 1; i >= 0; i--) { // Percorre do último caractere até o primeiro
            invertido = invertido + texto.charAt(i); // Vai montando o texto invertido
        }

        return invertido; // Retorna o texto invertido
    }

    public static void main(String[] args) { // Método principal
        Scanner input = new Scanner(System.in); // Cria Scanner
        System.out.println("Digite o texto: "); // Pede o texto
        String texto = input.nextLine(); // Lê o texto

        System.out.println("Texto invertido: " + inverterTexto(texto)); // Exibe o texto invertido
    }
}
