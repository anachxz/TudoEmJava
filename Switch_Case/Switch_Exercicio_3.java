package Switch_Case;
// Define o pacote onde esta classe está organizada no projeto.

import java.util.Scanner;
// Importa a classe Scanner, usada para capturar entrada do usuário.

public class Switch_Exercicio_3 {
    // Declaração da classe pública que contém o programa.

    public static void main(String[] args) {
        // Método principal: ponto de entrada da aplicação.

        Scanner sc = new Scanner(System.in);
        // Cria um objeto Scanner para permitir que o usuário digite algo no teclado.

        System.out.println("Digite uma letra: ");
        // Solicita ao usuário que insira uma letra.

        String letra = sc.nextLine().toUpperCase();
        // Lê a letra digitada como String,
        // usa toUpperCase() para garantir que será comparada em maiúsculo,
        // evitando erros ao digitar minúsculas.

        switch (letra) {
            // Estrutura switch para testar qual letra foi digitada.

            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                // Se a letra for uma dessas, é uma vogal.
                System.out.println("Vogal");
                break;
            // break encerra o bloco e evita cair nos próximos cases.

            default:
                // Qualquer outra letra não pertencente aos cases acima será consoante.
                System.out.println("Consoante");
        }
    }
}
