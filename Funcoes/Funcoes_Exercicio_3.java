// ===== Funcoes_Exercicio_3 =====
package Funcoes; // Define que esta classe pertence ao pacote "Funcoes"

import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

public class Funcoes_Exercicio_3 { // Declara a classe do exercício 3

    public static double media(double a, double b) { // Função que calcula a média entre dois números
        return (a + b) / 2; // Soma os dois valores e divide por 2
    }

    public static void main(String[] args) { // Método principal
        System.out.println("Digite o numero a: "); // Pede o primeiro número ao usuário
        Scanner sc = new Scanner(System.in); // Cria o Scanner para leitura
        int numeroA = sc.nextInt(); // Lê o primeiro número

        System.out.println("Digite o numero b: "); // Pede o segundo número ao usuário
        int numeroB = sc.nextInt(); // Lê o segundo número

        System.out.println("A média desses números é: " + media(numeroA, numeroB)); // Calcula e exibe a média
    }
}
