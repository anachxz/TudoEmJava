package Revisao;

import java.util.Scanner;

public class Controle_de_repeticao_com_break_e_continue_Exercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define a senha correta que será usada para comparação
        String senhaCorreta = "1234";

        // Loop permitindo até 3 tentativas de senha
        for (int tentativas = 1; tentativas <= 3; tentativas++) {
            System.out.println("Digite sua senha: ");
            String senha = sc.nextLine(); // Lê a senha digitada

            // Se a senha estiver correta, acessa e encerra o loop
            if (senha.equals(senhaCorreta)) {
                System.out.println("Acesso permitido");
                break; // interrompe o loop imediatamente
            } else {
                // Senha errada, informa qual tentativa foi
                System.out.println("Acesso negado. Tentativa " + tentativas + " de 3");
            }

            // Se chegou na terceira tentativa e ainda não acertou, bloqueia o acesso
            if (tentativas == 3) {
                System.out.println("Número de tentativas excedido. Acesso bloqueado");
            }
        }
    }
}
