package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Listas_Exemplo_8 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(6,3,8,15,2,14));

        System.out.println("Lista de numeros: " + numeros);

        int tamanho = numeros.size();
        System.out.println("O numero de elementos na lista é: "+tamanho);
        int maiorValor = Collections.max(numeros);
        System.out.println("O maior valor na lista é: "+maiorValor);

        int menorValor = Collections.min(numeros);
        System.out.println("O menor valor na lista é: "+menorValor);

        int somaTotal=0;

        for(int num: numeros) {
            somaTotal+=num;
        }
        System.out.println("A soma total dos elementos na lista é: "+somaTotal);

    }
}
