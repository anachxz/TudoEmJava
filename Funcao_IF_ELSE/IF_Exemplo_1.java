// Define o pacote onde a classe está localizada
package ExerciciosIF;

// Importa a classe Scanner para leitura de dados do usuário
import java.util.Scanner;

// Declaração da classe pública chamada IF_Exemplo_1
public class IF_Exemplo_1 {
    public static void main(String[] args) {

        // Declara uma variável inteira para armazenar a idade
        int idade;

        // Cria um objeto Scanner para ler dados do teclado
        Scanner sc = new Scanner(System.in);

        // Exibe uma mensagem pedindo para o usuário digitar a idade
        System.out.println("Digite sua idade: ");

        // Lê a idade digitada pelo usuário e armazena na variável idade
        idade = sc.nextInt();

        // Estrutura condicional que verifica se a idade é maior ou igual a 18
        if (idade >= 18) {
            // Se a condição for verdadeira, exibe que o usuário é maior de idade
            System.out.println("Você é maior de idade.");
        } else {
            // Se a condição for falsa, exibe que o usuário é menor de idade e encerra o programa
            System.out.println("Você é menor de idade.\nPrograma encerrado.");

        }

    }
}