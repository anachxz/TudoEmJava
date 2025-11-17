package For;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class For_Exemplo_2 {
    public static void main(String[] args) {

        // Cria uma lista fixa com as letras A até E
        List<String> lista = Arrays.asList("A", "B", "C", "D", "E");

        // For each para percorrer cada item da lista
        for (String item : lista) {
            System.out.println(item);

            // Quando encontrar o item igual a "C", o loop é interrompido
            if (item.matches("C")) {
                break; // Sai do loop imediatamente
            }
        }

        // Lista com nomes de frutas
        List<String> frutas = Arrays.asList("maça", "banana", "Laranja");

        // Aqui você imprime o objeto `frutas` inteiro em cada repetição
        // (Isso imprime a lista completa 3 vezes, porque não usa 'fruta' e sim 'frutas')
        for (String fruta : frutas) {
            System.out.println(frutas);
        }

        System.out.println();

        // Scanner para pegar um número digitado pelo usuário
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numeroDigitado = sc.nextInt();

        // Imprime todos os números de 1 até o número digitado (exclui o próprio número)
        for (int i = 1; i < numeroDigitado; i++) {
            System.out.println(i);
        }

        System.out.println();

        // Lista fixa com números de 1 a 10
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // For each pra verificar se cada número é par ou ímpar
        for (int numero : numeros) {

            // Verifica se o número é par usando o operador módulo (%)
            if (numero % 2 == 0) {
                System.out.println("Número: " + numero + " é par");
            } else {
                System.out.println(numero + " é impar");
            }
        }
    }
}
