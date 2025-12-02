package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Set_Exercicio_2 {
    public static void main(String[] args){

        // Cria o Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Cria um Set que armazena números únicos, sem repetição
        Set<Integer> numeros = new HashSet<>();

        System.out.println("Digite 6 números diferentes entre 1 e 60:");

        // O loop continua até que o Set contenha 6 números válidos
        while (numeros.size() < 6) {

            System.out.print("Digite um número: ");
            int numero1 = sc.nextInt();

            // Valida se o número está dentro do intervalo permitido
            if (numero1 < 1 || numero1 > 60) {
                System.out.println("Número inválido! Digite valores entre 1 e 60.\n");
                continue;  // volta para pedir outro número
            }

            // Tenta adicionar o número no Set; se já existir, não adiciona
            if (!numeros.add(numero1)) {
                System.out.println("Esse número já foi digitado!\n");
                continue;
            }

            // Se chegou aqui, o número foi aceito
            System.out.println("Número aceito!");
            System.out.println("Quantidade de números válidos: " + numeros.size());

            // Cria um TreeSet para exibir os números em ordem crescente
            Set<Integer> ordenados = new TreeSet<>(numeros);
            System.out.println("Números escolhidos até agora em ordem crescente: " + ordenados + "\n");
        }

        // Quando o usuário digita os 6 números válidos, exibe o resultado final
        System.out.println("\nVocê digitou 6 números válidos!");

        // Exibe a lista final em ordem crescente
        Set<Integer> finalOrdenados = new TreeSet<>(numeros);
        System.out.println("Lista final em ordem crescente: " + finalOrdenados + "\n");

    }
}
