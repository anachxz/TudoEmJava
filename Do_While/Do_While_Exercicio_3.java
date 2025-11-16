package Do_While;

import java.util.Scanner;

public class Do_While_Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Digite um numero (0 para sair): ");
            numero = sc.nextInt();


        }while (numero  != 0);
        System.out.println("Encerrando o programa...");
        }
    }

