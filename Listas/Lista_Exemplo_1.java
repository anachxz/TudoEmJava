package Listas;

import java.util.ArrayList;

public class Lista_Exemplo_1 {
    public static void main(String[] args) {

        // Criação de uma lista de Strings vazia
        // ArrayList é uma lista dinâmica, que cresce conforme adicionamos elementos
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando elementos à lista usando .add()
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("João");

        // Exibe a lista no formato padrão do Java
        // Exemplo: [Ana, Carlos, João]
        System.out.println("Lista completa (formato padrão):");
        System.out.println(nomes);

        // Exibe os nomes um por um, numerando cada item
        System.out.println("\nLista formada com numeração:");
        for (int i = 0; i < nomes.size(); i++) {

            // i + 1 → transforma 0,1,2 em 1,2,3 para ficar mais amigável
            // nomes.get(i) → acessa o elemento pelo índice
            System.out.println((i + 1) + "º nome: " + nomes.get(i));
        }

        // Mostra quantos nomes existem na lista
        System.out.println("\nTotal de nomes na lista: " + nomes.size());
    }
}
