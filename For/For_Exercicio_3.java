package For;

public class For_Exercicio_3 {
    public static void main(String[] args) {

        // Mensagem inicial explicando a proposta do programa
        System.out.println("\nImprimir quadrados dos números de 1 a 20: ");

        // Loop que percorre todos os números de 1 até 20
        for (int i = 1; i <= 20; i++) {

            // Calcula o quadrado do número atual (i * i)
            int quadrado = i * i;

            // Exibe o resultado no formato: "n ao quadrado = resultado"
            System.out.println(i + " ao quadrado = " + quadrado);
        }
    }
}
