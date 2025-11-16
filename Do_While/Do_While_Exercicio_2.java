package Do_While;

public class Do_While_Exercicio_2 {
    public static void main(String[] args) {

        System.out.println("Exibir todos os números pares de 0 a 50: "); // Mensagem introdutória

        int numero = 0; // Começa em 0, primeiro número par

        do {
            System.out.println("Número:  " + numero); // Exibe o número atual
            numero += 2; // Soma 2 para ir para o próximo número par

        } while (numero <= 50); // Repete enquanto o número ainda estiver dentro do limite
    }
}
