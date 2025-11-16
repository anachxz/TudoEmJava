package Do_While;

import java.util.Scanner;

public class Do_While_Exercicio_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria o objeto Scanner para ler entradas do usuário

        int numero;          // Variável que armazena cada número digitado
        int quantidade = 0;  // Contador de números positivos digitados

        do {
            System.out.println("Digite um numero (0 para sair): "); // Solicita um número
            numero = sc.nextInt(); // Lê o número informado

            if (numero > 0) {   // Verifica se o número digitado é positivo
                quantidade++;   // Se for, adiciona ao contador
            }

        } while (numero != 0); // Repete o loop enquanto o número for diferente de 0

        System.out.println("Você digitou: " + quantidade + " números positivos"); // Exibe total de números positivos
    }
}
