
package Listas; // Define o pacote onde a classe está localizada

import java.util.ArrayList; // Importa a classe ArrayList para trabalhar com listas dinâmicas
import java.util.Scanner;   // Importa a classe Scanner para entrada de dados via teclado

public class Listas_Exercicio_5 {
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Cria uma lista para armazenar todos os nomes digitados (pode ter repetidos)
        ArrayList<String> nomesOriginais = new ArrayList<>();

        // Cria uma lista para armazenar apenas nomes únicos (sem repetição)
        ArrayList<String> nomesUnicos = new ArrayList<>();

        // Solicita ao usuário 5 nomes e adiciona à lista original
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            nomesOriginais.add(nome);
        }

        // Percorre a lista original e adiciona à lista de únicos apenas se não existir ainda
        for (String nome : nomesOriginais) {
            if (!nomesUnicos.contains(nome)) {
                nomesUnicos.add(nome);
            }
        }

        // Exibe os nomes sem repetição
        System.out.println("\nNomes sem repetição:");
        for (String nome : nomesUnicos) {
            System.out.println("- " + nome);
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
