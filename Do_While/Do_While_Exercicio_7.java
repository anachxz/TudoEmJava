package Do_While;

import java.util.Scanner;

public class Do_While_Exercicio_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria o Scanner para ler a senha do usuário
        String senha; // Variável que armazenará a senha digitada

        do {
            System.out.print("Digite seu senha: "); // Pede para o usuário digitar a senha
            senha = sc.nextLine(); // Lê a senha digitada

            if (!senha.equals("1234")) { // Verifica se a senha está incorreta
                System.out.println("Senha invalida"); // Mensagem de erro
            }

        } while (!senha.equals("1234")); // Repete enquanto a senha for diferente de "1234"

        System.out.println("Senha correta!"); // Exibe mensagem após o usuário acertar
    }
}
