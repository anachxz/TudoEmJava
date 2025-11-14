package ExerciciosIF; // Define o pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class IF_Exercicio_4 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.println("Digite um número: ");
        int numero = sc.nextInt(); // Lê o número digitado

        // Verifica se o número está dentro do intervalo [10, 100]
        // Usa o operador lógico && (E) para garantir que ambas as condições sejam verdadeiras
        if (numero >= 10 && numero <= 100) {
            System.out.println("Número inserido dentro do intervalo!");
        } else {
            System.out.println("Número inserido fora do intervalo!");
        }
    }
}
