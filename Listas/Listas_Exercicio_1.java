
package Listas; // Define o pacote onde a classe está localizada

import java.util.ArrayList; // Importa a classe ArrayList para criar listas dinâmicas
import java.util.Scanner;   // Importa a classe Scanner para ler dados do usuário

public class Listas_Exercicio_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        ArrayList<String> nomes = new ArrayList<>(); // Cria uma lista dinâmica para armazenar os nomes

        System.out.println("Digite nomes (digite 'sair' para encerrar): ");

        // Lê o primeiro nome digitado pelo usuário
        nomes.add(scanner.nextLine());

        // Enquanto a lista NÃO contiver "sair", continua pedindo nomes
        while (!nomes.contains("sair")) {

            // Aqui está o problema: você está imprimindo a lista inteira, não o último nome
            // Corrigindo: pegar o último nome adicionado
            String ultimoNome = nomes.get(nomes.size() - 1);
            System.out.println("Nome " + ultimoNome + " adicionado com sucesso!");

            System.out.println("Digite seu nome: ");
            nomes.add(scanner.nextLine()); // Adiciona o próximo nome digitado

            // Se o usuário digitou "sair", encerra o loop
            if (nomes.contains("sair")) {
                System.out.println("Encerrando...");
                break;
            }
        }
    }
}
