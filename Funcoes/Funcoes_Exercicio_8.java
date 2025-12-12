// ===== Funcoes_Exercicio_8 =====
package Funcoes; // Define o pacote

import java.util.Scanner; // Importa Scanner

public class Funcoes_Exercicio_8 { // Declara a classe do exercício 8

    public static int contarVogais(String texto) { // Função que conta quantas vogais existem no texto
        int contador = 0; // Começa com 0 vogais contadas
        texto = texto.toLowerCase(); // Converte tudo para minúsculo para facilitar a comparação

        for (char c : texto.toCharArray()) { // Percorre cada caractere do texto
            if ("aeiou".indexOf(c) != -1) { // Verifica se o caractere está dentro de "aeiou"
                contador++; // Se for vogal, incrementa o contador
            }
        }

        return contador; // Retorna o total de vogais
    }

    public static void main(String[] args) { // Método principal
        Scanner input = new Scanner(System.in); // Cria Scanner
        System.out.println("Digite o texto: "); // Pede o texto
        String texto = input.nextLine(); // Lê o texto

        System.out.println("Numero de vogais: " + contarVogais(texto)); // Exibe o total de vogais
    }
}

