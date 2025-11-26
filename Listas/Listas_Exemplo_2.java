package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Listas_Exemplo_2 {
    public static void main(String[] args) {

        System.out.println("========== Lista de notas de um aluno =========");

        // Criando uma lista de notas já preenchida com valores
        // Arrays.asList permite inicializar a lista rapidamente
        ArrayList<Integer> notasAluno = new ArrayList<>(Arrays.asList(85, 90, 78, 92, 88));

        // Imprime a lista inteira
        System.out.println("Notas do aluno: " + notasAluno);

        // Exemplo de variável String comum (não faz parte de uma lista)
        String mensagem = "Olá";
        System.out.println("Mensagem do aluno: " + mensagem);
        System.out.println("Tipo: String");

        // Criando uma lista de Strings
        ArrayList<String> listaDeStrings = new ArrayList<>(Arrays.asList("Olá", "Mundo"));

        // Imprime a lista de Strings
        System.out.println("Lista de Strings: " + listaDeStrings);

        // Criando uma lista de inteiros e mostrando como alterar valores existentes
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3));

        // .set(posição, novoValor) substitui o elemento da posição indicada
        lista.set(0, 100);  // substitui o índice 0
        lista.set(1, 50);   // substitui o índice 1

        // Exibe a lista já modificada
        System.out.println("Lista alterada: " + lista);
    }
}
