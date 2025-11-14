// Define o pacote onde a classe está localizada
package ExerciciosIF;

// Importa a classe Scanner para leitura de dados do usuário
import java.util.Scanner;

// Declaração da classe pública chamada IF_Exemplo_2
public class IF_Exemplo_2 {
    public static void main(String[] args) {

        // Declara duas variáveis do tipo double para armazenar notas
        double nota;
        double notaRecuperacao; // (não utilizada neste exemplo, mas declarada)

        // Cria um objeto Scanner para ler dados do teclado
        Scanner sc = new Scanner(System.in);

        // Exibe uma mensagem pedindo para o usuário digitar a nota
        System.out.println("Digite sua nota:");

        // Lê a nota digitada pelo usuário e armazena na variável nota
        nota = sc.nextDouble();

        // Estrutura condicional para verificar a situação do aluno
        if (nota >= 7) {
            // Se a nota for maior ou igual a 7, aluno está aprovado
            System.out.println("Aluno aprovado");
        } else if (nota >= 5 && nota < 7) {
            // Se a nota estiver entre 5 e 6.9, aluno está em recuperação
            System.out.println("Aluno em recuperação");
        } else {
            // Se a nota for menor que 5, aluno está reprovado
            System.out.println("Aluno reprovado!");
        }


    }
}
