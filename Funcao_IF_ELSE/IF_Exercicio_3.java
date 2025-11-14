package ExerciciosIF; // Define o pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class IF_Exercicio_3 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite o primeiro número inteiro
        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt(); // Lê o primeiro número

        // Solicita ao usuário que digite o segundo número inteiro
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt(); // Lê o segundo número

        // Compara os dois números
        if (num1 > num2) {
            // Se o primeiro número for maior
            System.out.println("O número 1 é maior que o número 2");
        } else if (num2 > num1) {
            // Se o segundo número for maior
            System.out.println("O número 2 é maior que o número 1");
        } else {
            // Se os dois números forem iguais
            System.out.println("Os números 1 e 2 são iguais!");
        }
    }
}