package Do_While;

import java.util.Scanner;

public class Do_While_Exercicio_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner para ler o número digitado

        int num; // Número escolhido pelo usuário para gerar a tabuada
        int i = 1; // Contador da multiplicação, começa em 1

        System.out.println("Digite um numero inteiro para realizar sua tabuada: "); // Solicita o número
        num = sc.nextInt(); // Lê o número informado

        // Estrutura do-while: executa primeiro, verifica depois
        do {
            System.out.println(num + " x " + i + " = " + (num * i)); // Exibe a multiplicação atual
            i++; // Incrementa o contador
        } while (i <= 10); // Continua até chegar em 10

    }
}
