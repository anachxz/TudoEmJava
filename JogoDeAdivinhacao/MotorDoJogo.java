package jogo;

import java.util.Random;

public class MotorDoJogo {

    private final Random random = new Random();

    /**
     * Inicia uma partida e retorna:
     * - número de tentativas usadas se o jogador acertar
     * - -1 se o jogador não acertar dentro do limite
     */
    public int iniciar(Dificuldade dificuldade) {
        int numeroSecreto = random.nextInt(
                dificuldade.getMax() - dificuldade.getMin() + 1
        ) + dificuldade.getMin();

        int tentativasMax = dificuldade.getTentativasMax();
        int tentativasUsadas = 0;

        System.out.println("\n=== Jogo de Adivinhação ===");
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("Adivinhe um número entre " + dificuldade.getMin() + " e " + dificuldade.getMax());
        System.out.println("Você tem " + tentativasMax + " tentativas.\n");

        while (tentativasUsadas < tentativasMax) {
            int palpite = Utils.lerInt("Digite o palpite: ");
            tentativasUsadas++;

            if (palpite == numeroSecreto) {
                System.out.println("\nAcertou! O número era: " + numeroSecreto);
                System.out.println("Tentativas usadas: " + tentativasUsadas);
                return tentativasUsadas;
            }

            if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Muito baixo!");
            }

            System.out.println("Tentativas restantes: " + (tentativasMax - tentativasUsadas) + "\n");
        }

        System.out.println("\nAcabaram suas tentativas!");
        System.out.println("O número era: " + numeroSecreto);
        return -1;
    }
}
