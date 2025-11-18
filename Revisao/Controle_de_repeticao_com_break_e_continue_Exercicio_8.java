package Revisao;

import java.util.Random;
import java.util.Scanner;

public class Controle_de_repeticao_com_break_e_continue_Exercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int numero;
        while(true){
            numero = aleatorio.nextInt(20);
            System.out.println("Número gerado: "+numero);
            if(numero==10){
                break;
            }
        }
    }
}
