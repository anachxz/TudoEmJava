package For;

public class For_Exercicio_2 {
    public static void main(String[] args) {

        // Mensagem inicial dizendo o que o programa faz
        System.out.println("\nImpressão de múltiplos de 3 entre 1 e 100\n");

        // Loop que percorre de 1 até 99 (pois usa < 100)
        for(int i = 1; i < 100; i++){

            // Se o resto da divisão de i por 3 for zero,
            // significa que i é múltiplo de 3
            if (i % 3 == 0){

                // Imprime apenas os números múltiplos de 3
                System.out.println("Números: "+i);
            }
        }
    }
}
