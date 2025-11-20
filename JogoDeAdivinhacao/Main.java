package jogo;

public class Main {

    public static void main(String[] args) {
        MotorDoJogo motor = new MotorDoJogo();

        int melhorPontuacao = Integer.MAX_VALUE; // menor número de tentativas
        Dificuldade melhorDificuldade = null;

        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1 - Fácil");
            System.out.println("2 - Médio");
            System.out.println("3 - Difícil");
            System.out.println("4 - Insano");
            System.out.println("9 - Ver melhor resultado da sessão");
            System.out.println("0 - Sair");

            int opcao = Utils.lerInt("Escolha a opção: ");

            if (opcao == 0) {
                System.out.println("Encerrando...");
                break;
            }

            if (opcao == 9) {
                if (melhorDificuldade == null) {
                    System.out.println("\nAinda não há resultados no ranking desta sessão.\n");
                } else {
                    System.out.println("\n=== MELHOR RESULTADO DA SESSÃO ===");
                    System.out.println("Dificuldade: " + melhorDificuldade);
                    System.out.println("Tentativas: " + melhorPontuacao + "\n");
                }
                continue;
            }

            Dificuldade dificuldade = switch (opcao) {
                case 1 -> Dificuldade.FACIL;
                case 2 -> Dificuldade.MEDIO;
                case 3 -> Dificuldade.DIFICIL;
                case 4 -> Dificuldade.INSANO;
                default -> null;
            };

            if (dificuldade == null) {
                System.out.println("Opção inválida!\n");
                continue;
            }

            int resultado = motor.iniciar(dificuldade);

            if (resultado != -1 && resultado < melhorPontuacao) {
                melhorPontuacao = resultado;
                melhorDificuldade = dificuldade;
                System.out.println("\nNovo recorde da sessão! " +
                        resultado + " tentativas na dificuldade " + dificuldade + "!\n");
            }

            String jogarNovamente = Utils.lerString("\nDeseja jogar novamente? (s/n): ");
            if (!jogarNovamente.equalsIgnoreCase("s")) {
                System.out.println("Até a próxima!");
                break;
            }

            System.out.println("\n--------------------------------------------\n");
        }
    }
}
