package Revisao;

import java.util.Scanner;

public class Controle_de_repeticao_com_break_e_continue_Exercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();
        // transforma tudo em minúsculo pra facilitar a comparação

        // percorre cada caractere da palavra
        for (int i = 0; i < palavra.length(); i++) {

            char letra = palavra.charAt(i); // pega o caractere da vez

            // se NÃO for vogal → pula para a próxima iteração do loop
            if (!(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')) {
                continue;
            }

            // só cai aqui se for vogal
            System.out.println("A letra " + letra + " é vogal");
        }
    }
}
