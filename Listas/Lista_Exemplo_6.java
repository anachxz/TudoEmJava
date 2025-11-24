package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista_Exemplo_6 {
    public static void main(String[] args) {

        System.out.println("=== Slicing de listas em Java (simulando) ===");

        // Lista base com números de 0 a 9
        ArrayList<Integer> minhaLista = new ArrayList<>(Arrays.asList(
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println("Lista original: " + minhaLista);

        // subList(início, fim) → cria uma visão da lista entre início (incluído)
        // e fim (NÃO incluído), igual ao slicing do Python
        List<Integer> subconjunto = minhaLista.subList(0, 4);
        System.out.println("\nSubconjunto [0,4): " + subconjunto);

        // Pega os dois primeiros elementos
        List<Integer> primeirosElementos = minhaLista.subList(0, 2);
        System.out.println("Primeiros elementos [0,2): " + primeirosElementos);

        // Todos os elementos a partir do índice 2 até o final
        List<Integer> elementosDepoisDo2 = minhaLista.subList(2, minhaLista.size());
        System.out.println("Elementos a partir do índice 2 [2:]: " + elementosDepoisDo2);

        // Criando uma lista com elementos alternados (como slicing [::2] do Python)
        ArrayList<Integer> elementosAlternados = new ArrayList<>();
        for (int i = 0; i < minhaLista.size(); i += 2) {
            elementosAlternados.add(minhaLista.get(i));
        }
        System.out.println("Elementos alternados [::2]: " + elementosAlternados);

        // Slicing equivalente a [2:8:2] → do índice 2 ao 7 pulando de 2 em 2
        ArrayList<Integer> subconjuntoAlternados = new ArrayList<>();
        for (int i = 2; i < 8; i += 2) {
            subconjuntoAlternados.add(minhaLista.get(i));
        }
        System.out.println("Subconjunto alternado [2:8:2]: " + subconjuntoAlternados);

        // Acessando elementos específicos
        System.out.println("minhaLista[2] = " + minhaLista.get(2));
        System.out.println("minhaLista[4] = " + minhaLista.get(4));
        System.out.println("minhaLista[6] = " + minhaLista.get(6));
    }
}
