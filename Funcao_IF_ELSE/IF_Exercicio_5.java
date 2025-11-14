package ExerciciosIF; // Define o pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class IF_Exercicio_5 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite um número inteiro
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt(); // Lê o número digitado

        // Verifica se o número é divisível por 3 e por 5 simultaneamente
        // Usa o operador módulo (%) para calcular o resto da divisão
        // Se o resto da divisão por 3 for 0 E por 5 também for 0, então é divisível por ambos
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("O número é divisível por 3 e 5 simultaneamente!");
        } else {
            System.out.println("O número não é divisível por 3 e 5 simultaneamente!");
        }


    }
}