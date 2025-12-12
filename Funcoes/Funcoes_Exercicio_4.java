// ===== Funcoes_Exercicio_4 =====
package Funcoes; // Define o pacote

import java.util.Scanner; // Importa Scanner para leitura

public class Funcoes_Exercicio_4 { // Declara a classe do exercício 4

    public static boolean ehMaiorDeIdade(int idade){ // Função que verifica se a pessoa é maior de idade
        return idade >= 18; // Retorna true se idade for 18 ou mais
    }

    public static void main(String[] args) { // Método principal
        System.out.println("Digite sua idade: "); // Pede a idade
        Scanner sc = new Scanner(System.in); // Cria Scanner
        int idade = sc.nextInt(); // Lê a idade

        if (ehMaiorDeIdade(idade)) { // Se for maior de idade
            System.out.println("É maior de idade!"); // Mostra mensagem de maior
        } else { // Caso contrário
            System.out.println("Menor de idade!"); // Mostra mensagem de menor
        }
    }
}
