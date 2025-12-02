package Set;

import java.util.HashSet;
import java.util.Set;

public class Set_Completo_Exemplos {
    public static void main(String[] args) {

        // Cria um Set para armazenar frutas sem permitir elementos duplicados
        Set<String> frutas = new HashSet<>();

        // Adiciona frutas ao conjunto
        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Abacaxi");
        frutas.add("Manga");

        // Tentativa de adicionar duplicado; será ignorado pelo Set
        frutas.add("Maça");

        // Exibe todas as frutas presentes no Set
        System.out.println("Frutas: " + frutas);

        // Verifica se o Set contém a fruta "Banana"
        if (frutas.contains("Banana")) {
            System.out.println("Banana está presente");
        }

        // Remove um elemento específico do conjunto
        frutas.remove("Laranja");
        System.out.println("Após remover Laranja: " + frutas);

        // Se existir "Manga", remove e substitui por "Melancia"
        if (frutas.contains("Manga")) {
            frutas.remove("Manga");
            frutas.add("Melancia");
        }
        System.out.println("Após editar Manga para Melancia: " + frutas);

        // Cria um novo Set para armazenar frutas que começam com a letra M
        Set<String> filtradas = new HashSet<>();
        for (String fruta : frutas) {
            if (fruta.startsWith("M")) {
                filtradas.add(fruta);
            }
        }
        System.out.println("Frutas filtradas (começam com M): " + filtradas);

        // Cria outro conjunto de frutas
        Set<String> frutas2 = new HashSet<>();
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Abacaxi");

        // Adiciona todas as frutas do segundo conjunto ao primeiro
        frutas.addAll(frutas2);
        System.out.println("Após juntar os conjuntos: " + frutas);

        // Cria um Set para armazenar a interseção entre os conjuntos
        Set<String> intersecao = new HashSet<>();
        intersecao.retainAll(frutas2);  // este conjunto está vazio inicialmente, então nada será retido
        System.out.println("Interseção: " + intersecao);

        // Calcula a diferença entre os conjuntos (frutas - frutas2)
        Set<String> diferenca = new HashSet<>(frutas);
        diferenca.removeAll(frutas2);
        System.out.println("Diferença: " + diferenca);

        // Limpa completamente o conjunto frutas
        frutas.clear();
        System.out.println("Após limpar: " + frutas);

    }
}
