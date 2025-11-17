package For;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class For_Exercicio_1 {
    public static void main(String[] args) {

        // Apenas uma mensagem bonitinha explicando o que o programa vai fazer
        System.out.println("\nMostrar apenas números impares de 1 a 99\n");

        // Loop começando em 1 (primeiro número ímpar)
        // Vai até 99
        // Incrementa de 2 em 2, garantindo que só passe por números ímpares
        for(int i = 1; i <= 99; i+=2){
            // Imprime o número ímpar atual
            System.out.println("Números impares: "+i);
        }
    }
}
