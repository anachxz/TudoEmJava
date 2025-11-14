package ExerciciosIF; // Define o pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class IF_Exercicio_9 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite uma letra
        System.out.println("Digite uma letra: ");
        String letra = sc.nextLine().toUpperCase(); // Converte para maiúscula para facilitar a comparação

        /*
         Verifica se a letra é uma vogal:
         - Compara com "A", "E", "I", "O", "U"
         - Usa operador lógico OR (||) para verificar se é igual a qualquer uma dessas letras
        */
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("A letra " + letra + " é vogal");
        } else {
            System.out.println("A letra " + letra + " é consoante");
        }
    }
}