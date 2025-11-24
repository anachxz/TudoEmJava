package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Lista_Exemplo_3 {
    public static void main(String[] args) {

        System.out.println("\n=== Criando e acessando listas em Java ===\n");

        // Criando uma lista de inteiros já preenchida
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Lista de números: " + numeros);

        // Criando uma lista de Strings com frutas
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Cereja"));
        System.out.println("Lista de frutas: " + frutas);

        // Lista mista: pode conter qualquer tipo de dado
        // Para isso usamos ArrayList<Object>
        ArrayList<Object> mista = new ArrayList<>();

        // Inserindo diferentes tipos de dados
        mista.add(10);                               // Integer
        mista.add("Olá");                            // String
        mista.add(2.5);                              // Double

        // Inserindo uma lista dentro da lista
        mista.add(new ArrayList<>(Arrays.asList("a", "b")));

        mista.add(true);                             // Boolean

        System.out.println("Lista mista: " + mista);


        // Nova lista de frutas com letras minúsculas
        ArrayList<String> frutas2 = new ArrayList<>(Arrays.asList(
                "maçã", "banana", "cereja", "damasco"));

        // Acessando elementos por índice
        System.out.println("\nPrimeira fruta: " + frutas2.get(0));
        System.out.println("Terceira fruta: " + frutas2.get(2));

        // Tamanho total da lista
        int tamanho = frutas2.size();

        // Acessando a última fruta usando tamanho - 1
        System.out.println("\nÚltima fruta (tamanho - 1): " + frutas2.get(tamanho - 1));

        // Acessando a penúltima fruta usando tamanho - 2
        System.out.println("Penúltima fruta (tamanho - 2): " + frutas2.get(tamanho - 2));
    }
}
