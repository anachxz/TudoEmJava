import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class IF_Exemplo_4 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite sua idade
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt(); // Lê a idade digitada
        sc.nextLine(); // Consome a quebra de linha pendente após o nextInt()

        // Pergunta se o usuário é estudante
        System.out.println("Você é estudante? (sim/não)");
        String estudante = sc.nextLine().toLowerCase(); // Lê a resposta e converte para minúsculas

        // Verifica se a idade é menor que 18 OU se a pessoa é estudante
        if (idade < 18 || estudante.equals("sim")) {
            // Se qualquer uma das condições for verdadeira, tem direito à meia-entrada
            System.out.println("Você tem direito a meia-entrada no cinema!");
        } else {
            // Caso contrário, não tem direito
            System.out.println("Você não tem direito a meia-entrada no cinema!");
        }
    }
}