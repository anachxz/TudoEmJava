package While;

import java.util.Scanner;

public class While_Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Imprimir numeros pares de 0 e 50(inclusive)");
        int contador=0;
        while(contador<=50){
            System.out.println("Contador: "+contador);
            contador+=2;
        }
    }
}
