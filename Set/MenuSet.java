package Set;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class MenuSet {
    public static void main(String[] args) {

        // Cria um Set para armazenar elementos sem duplicatas
        Set<String> conjunto = new HashSet<>();

        // Scanner para leitura do teclado
        Scanner sc = new Scanner(System.in);
        int opcao;

        // Loop do menu, continua até o usuário escolher a opção 0 (sair)
        do {
            System.out.println("\n==== MENU SET ====");
            System.out.println("1. Adicionar elemento");
            System.out.println("2. Remover elemento");
            System.out.println("3. Editar elementos");
            System.out.println("4. Listar elementos");
            System.out.println("5. Limpar conjunto");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opcao");

            opcao = sc.nextInt();
            sc.nextLine(); // Consome quebra de linha pendente

            switch(opcao) {

                case 1:
                    // Adiciona novo elemento ao Set
                    System.out.println("Digite o elemento para adicionar: ");
                    String novo = sc.nextLine();
                    if (conjunto.add(novo)) {
                        System.out.println("Elemento adicionado com sucesso!");
                    } else {
                        System.out.println("Elemento já existente!");
                    }
                    break;

                case 2:
                    // Remove elemento se existir
                    System.out.println("Digite o elemento para remover: ");
                    String remover = sc.nextLine();
                    if (conjunto.remove(remover)) {
                        System.out.println("Elemento removido com sucesso!");
                    } else {
                        System.out.println("Elemento não encontrado!");
                    }
                    break;

                case 3:
                    // Edita elemento substituindo um antigo por um novo
                    System.out.println("Digite o elemento para editar: ");
                    String antigo = sc.nextLine();
                    if (conjunto.contains(antigo)) {
                        System.out.println("Digite o elemento novo para editar: ");
                        String novoValor = sc.nextLine();
                        conjunto.remove(antigo);
                        conjunto.add(novoValor);
                    } else {
                        System.out.println("Elemento não encontrado!");
                    }
                    break;

                case 4:
                    // Lista todos os elementos do conjunto
                    if (conjunto.isEmpty()) {
                        System.out.println("Conjunto está vazio!");
                    } else {
                        System.out.println("Elementos no conjunto: " + conjunto);
                    }
                    break;

                case 5:
                    // Limpa todos os elementos do Set
                    conjunto.clear();
                    System.out.println("Elementos removidos com sucesso!");
                    break;

                case 0:
                    // Encerra o programa
                    System.out.println("Saindo do programa");
                    break;

                default:
                    // Caso o usuário escolha uma opção inválida
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0); // Continua até opção 0

    }
}
