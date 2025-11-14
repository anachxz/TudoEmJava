package ExerciciosIF; // Define o pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class IF_Exercico_7 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite um ano
        System.out.println("Digite um ano: ");
        int ano = sc.nextInt(); // Lê o ano digitado

        /*
         Regras para ano bissexto:
         - É bissexto se:
           (divisível por 4 e não divisível por 100) OU divisível por 400
        */
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("O ano digitado foi: " + ano + " \nÉ bissexto!");
        } else {
            System.out.println("O ano digitado foi: " + ano + " \nNão é bissexto!");
        }
    }
}
