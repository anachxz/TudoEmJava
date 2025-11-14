import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class IF_Exemplo_3 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite sua idade
        System.out.println("Digite sua idade: ");

        // Lê a idade digitada e armazena na variável 'idade'
        int idade = sc.nextInt();

        // Consome a quebra de linha pendente após o nextInt()
        sc.nextLine();

        // Pergunta se o usuário é brasileiro ou naturalizado
        System.out.println("Você é brasileiro/naturalizado? (sim/não) ");

        // Lê a resposta do usuário, converte para minúsculas e armazena em 'naturalide'
        String naturalide = sc.nextLine().toLowerCase();

        // Verifica se a idade é maior ou igual a 16 E se a resposta foi "sim"
        if (idade >= 16 && naturalide.equals("sim")) {
            // Se as duas condições forem verdadeiras, o usuário pode votar
            System.out.println("Você pode votar!");
        } else {
            // Caso contrário, o usuário não pode votar
            System.out.println("Você não pode votar!");
        }
    }
}
