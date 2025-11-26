
package Listas; // Define o pacote onde a classe está localizada

import java.util.ArrayList; // Importa a classe ArrayList para trabalhar com listas dinâmicas
import java.util.Scanner;   // Importa a classe Scanner para entrada de dados via teclado

public class Listas_Exercicio_3 {
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Cria uma lista dinâmica para armazenar nomes
        ArrayList<String> nomes = new ArrayList<>();

        // Adiciona nomes fixos à lista
        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Gabriela");

        // Solicita ao usuário um nome para verificar se está na lista
        System.out.println("Digite o nome para ver se ele está na lista: ");
        String nome = scanner.next();

        // Verifica se o nome digitado está presente na lista
        // OBS: O código original tinha erro: usava nome.contains(nome), mas deveria ser nomes.contains(nome)
        if (nomes.contains(nome)) {
            System.out.println("Nome encontrado!");
        } else {
            System.out.println("Nome não encontrado!");
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
