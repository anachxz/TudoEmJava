package ExerciciosIF; // Define o pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class IF_Exercicio_1 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite um número inteiro
        System.out.println("Digite um número: ");
        int numeroInteiro = sc.nextInt(); // Lê o número digitado

        // Verifica se o número é maior que zero
        if (numeroInteiro > 0) {
            System.out.println("O número é positivo");
        } else {
            // Caso contrário (zero ou negativo), imprime que não é positivo
            System.out.println("O número não é positivo");
        }
    }
}