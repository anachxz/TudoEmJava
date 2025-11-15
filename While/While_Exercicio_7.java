package While;

import java.util.Scanner;

public class While_Exercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha;

        // Solicita ao usuário que digite a senha pela primeira vez
        System.out.println("Digite sua senha: ");
        senha = sc.nextInt();

        // Enquanto a senha digitada for diferente de 1234, continua pedindo
        while (senha != 1234) {
            // Informa que a senha está incorreta
            System.out.println("Senha " + senha + " incorreta!");

            // Solicita novamente a senha
            System.out.println("Digite sua senha: ");
            senha = sc.nextInt();
        }

        // Se saiu do while, significa que a senha é correta
        if (senha == 1234) {
            System.out.println("Senha " + senha + " correta! Acesso permitido!");
        }
    }
}
