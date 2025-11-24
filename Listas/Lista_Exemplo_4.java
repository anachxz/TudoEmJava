package Listas;

import java.util.Arrays;
import java.util.ArrayList;

public class Lista_Exemplo_4 {
    public static void main(String[] args) {

        System.out.println("=== 1. ADICIONAR ELEMENTOS ===");

        // Criando lista inicial com duas frutas
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("maçã", "banana"));

        // add(valor) → adiciona ao final da lista
        frutas.add("cereja");
        System.out.println("add (append): " + frutas);

        // Reiniciando a lista para o próximo exemplo
        frutas = new ArrayList<>(Arrays.asList("maçã", "banana", "cereja"));

        // add(valor) novamente, para demonstrar inserção comum
        frutas.add("abacate");
        System.out.println("add (index, valor) (insert): " + frutas);


        System.out.println("\n=== 2. REMOVER ELEMENTOS ===");

        frutas = new ArrayList<>(Arrays.asList("maçã", "banana", "cereja"));

        // remove(index) → remove pelo índice
        frutas.remove(1); // remove "banana"
        System.out.println("remove(index 1): " + frutas);

        // Removendo último elemento usando size() - 1
        frutas.remove(frutas.size() - 1); // remove "cereja"
        System.out.println("remove último: " + frutas);


        System.out.println("\n=== 3. CONCATENAR LISTAS ===");

        ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        // Criando nova lista com elementos de lista1
        ArrayList<Integer> uniao = new ArrayList<>(lista1);

        // addAll(lista) → adiciona todos os elementos de outra lista
        uniao.addAll(lista2);
        System.out.println("concatenar (lista1 + lista2): " + uniao);

        // Outra forma, usando a própria lista1
        lista1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        lista2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        lista1.addAll(lista2);
        System.out.println("addAll (extend): " + lista1);


        System.out.println("\n=== 4. REPETIR LISTAS ===");

        ArrayList<String> repeticao = new ArrayList<>();

        // Repetindo elementos manualmente 3 vezes
        for (int i = 0; i < 3; i++) {
            repeticao.add("a");
            repeticao.add("b");
        }

        System.out.println("repetição manual (*): " + repeticao);


        System.out.println("\n=== 5. VERIFICAR SE UM ITEM ESTÁ NA LISTA ===");

        frutas = new ArrayList<>(Arrays.asList("maçã", "banana", "cereja"));

        // contains(valor) → verifica se o item existe
        System.out.println("Contém banana? " + frutas.contains("banana"));
        System.out.println("Contém uva? " + frutas.contains("uva"));


        System.out.println("\n=== FIM DAS OPERAÇÕES ===");
    }
}
