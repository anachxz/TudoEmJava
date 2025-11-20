package jogo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    private static final Scanner scanner = new Scanner(System.in);

    public static int lerInt(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                int valor = scanner.nextInt();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.nextLine(); // limpa o buffer
            }
        }
    }

    public static String lerString(String msg) {
        System.out.print(msg);
        return scanner.next();
    }
}
