package Do_While;

public class Do_While_Exercicio_1 {
    public static void main(String[] args) {

        System.out.println("Exibir todos os números de 1 a 100 "); // Mensagem inicial explicando o propósito

        int contador = 1; // Variável que começa em 1 e será usada para contar até 100

        do {
            System.out.println("Número: " + contador); // Exibe o número atual
            contador++; // Incrementa o contador em 1
        } while (contador <= 100); // Continua repetindo enquanto contador for menor ou igual a 100
    }
}
