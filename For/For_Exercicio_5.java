package For;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class For_Exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pede ao usuário uma linha contendo palavras separadas por vírgulas
        System.out.println("Digite palavras separadas por vírgulas: ");
        String linhaDigitada = sc.nextLine(); // Lê a linha inteira digitada

        // Divide a string nas vírgulas e transforma em uma lista
        List<String> palavras = Arrays.asList(linhaDigitada.split(","));

        // Percorre cada palavra da lista usando for-each
        for (String palavra : palavras) {
            palavra = palavra.trim(); // Remove espaços extras antes/depois da palavra

            // Verifica se a palavra tem mais de 4 caracteres
            if (palavra.length() > 4) {
                System.out.println(palavra); // Imprime somente as palavras maiores que 4 letras
            }
        }
    }
}
