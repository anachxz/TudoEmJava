
 package Listas; // Define o pacote onde a classe está localizada

import java.util.ArrayList; // Importa a classe ArrayList para listas dinâmicas
import java.util.Scanner;   // Importa a classe Scanner para entrada de dados

public class Exemplo_Sistema_De_Listas_Com_Menu_Interativo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria objeto Scanner para ler entradas do usuário
        ArrayList<String> lista = new ArrayList<>(); // Cria uma lista dinâmica para armazenar os itens
        int opcao; // Variável para armazenar a opção escolhida pelo usuário

        // Estrutura de repetição para manter o menu ativo até que o usuário escolha sair
        do {
            // Exibe o menu
            System.out.println("\n==== MENU DA LISTA ====");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Alterar item");
            System.out.println("4. Listar itens");
            System.out.println("5. Limpar lista");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt(); // Lê a opção escolhida
            scanner.nextLine(); // Consome a quebra de linha deixada pelo nextInt()

            // Estrutura switch para executar a ação correspondente à opção escolhida
            switch (opcao) {

                case 1: // Adicionar item
                    System.out.print("Digite o item a adicionar: ");
                    String novoItem = scanner.nextLine();
                    lista.add(novoItem);
                    System.out.println("Item adicionado com sucesso!");
                    break;

                case 2: // Remover item
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia!");
                    } else {
                        System.out.print("Digite o nome do item que deseja remover: ");
                        String itemRemover = scanner.nextLine();
                        if (lista.remove(itemRemover)) {
                            System.out.println("Item removido com sucesso!");
                        } else {
                            System.out.println("Item não encontrado.");
                        }
                    }
                    break;

                case 3: // Alterar item
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia!");
                    } else {
                        System.out.print("Digite o nome do item que deseja alterar: ");
                        String itemAntigo = scanner.nextLine();
                        if (lista.contains(itemAntigo)) {
                            System.out.print("Digite o novo valor: ");
                            String itemNovo = scanner.nextLine();
                            int indice = lista.indexOf(itemAntigo);
                            lista.set(indice, itemNovo);
                            System.out.println("Item alterado com sucesso!");
                        } else {
                            System.out.println("Item não encontrado.");
                        }
                    }
                    break;

                case 4: // Listar itens
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia!");
                    } else {
                        System.out.println("Itens da lista:");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i + 1) + ". " + lista.get(i));
                        }
                    }
                    break;

                case 5: // Limpar lista
                    lista.clear();
                    System.out.println("Lista limpa com sucesso!");
                    break;

                case 6: // Sair
                    System.out.println("Saindo do programa. Até mais!");
                    break;

                default: // Opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 6); // Continua até que a opção seja 6 (sair)
    }
}
