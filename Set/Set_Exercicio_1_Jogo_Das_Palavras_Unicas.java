package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Set_Exercicio_1_Jogo_Das_Palavras_Unicas {
    public static void main(String[] args) {

        // Cria um Set para armazenar palavras sem permitir duplicação
        Set<String> palavras = new HashSet<>();

        // Scanner para ler as entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Loop principal do programa, termina quando o usuário digita "fim"
        while (true) {

            System.out.println("Digite uma palavra para adicionar (digite 'fim' para sair): ");
            String palavra = sc.nextLine().toLowerCase();

            // Verifica se o usuário deseja encerrar o programa
            if (palavra.equals("fim")) break;

            // Tenta adicionar a palavra no Set; retorna false se já existir
            if (palavras.add(palavra)) {
                System.out.println("Palavra adicionada: " + palavra);
            } else {
                System.out.println("Essa palavra já foi digitada!");
            }

            // Exibe todas as palavras já adicionadas
            System.out.println("\nResultado:");
            System.out.println("Palavras digitadas (sem duplicadas): " + palavras);
            System.out.println("Total de palavras únicas: " + palavras.size());

            // Cria um TreeSet para organizar as palavras em ordem alfabética
            Set<String> ordenadas = new TreeSet<>(palavras);
            System.out.println("Ordenadas em ordem alfabética: " + ordenadas);

            // Solicita uma palavra para pesquisa dentro do Set
            System.out.println("\nDigite uma palavra para pesquisar:");
            String palavraPesquisa = sc.nextLine().toLowerCase();

            // Verifica se a palavra pesquisada está no conjunto
            if (palavras.contains(palavraPesquisa)) {
                System.out.println("Palavra buscada: " + palavraPesquisa + " está na lista!");
            } else {
                System.out.println("Palavra buscada: " + palavraPesquisa + " não está na lista!");
            }

            System.out.println();
        }

    }
}
