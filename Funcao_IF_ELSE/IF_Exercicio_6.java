package ExerciciosIF; // Define o pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class IF_Exercicio_6 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite um número inteiro
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt(); // Lê o número digitado

        // Estrutura condicional para verificar se o número é positivo, negativo ou zero
        if (num > 0) {
            System.out.println("Número positivo");
        } else if (num < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número é o zero");
        }
    }
}