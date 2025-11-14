package ExerciciosIF; // Define o pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class IF_Exercicio_2 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite um número inteiro
        System.out.println("Digite um número inteiro: ");
        int numeroInteiro = sc.nextInt(); // Lê o número digitado

        // Verifica se o número é par usando o operador módulo (%)
        // Se o resto da divisão por 2 for igual a zero, o número é par
        if (numeroInteiro % 2 == 0) {
            System.out.println("O número é par");
        } else {
            // Caso contrário, o número é ímpar
            System.out.println("O número é ímpar");
        }
    }
}