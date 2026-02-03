package ExercicioPOO3_Evento;

import java.util.Scanner;

/*
 * Classe principal com menu de interação
 */
public class Main {

    // Exibe o menu
    private static void mostrarMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Reservar lugares");
        System.out.println("2 - Cancelar reserva");
        System.out.println("3 - Consultar status do evento");
        System.out.println("4 - Sair");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Criação do evento
        System.out.print("Digite a capacidade total do evento: ");
        int capacidade = sc.nextInt();

        Evento evento = new Evento(capacidade);

        // Loop principal do sistema
        while (true) {
            mostrarMenu();
            System.out.print("Opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {

                case 1 -> {
                    System.out.print("Quantos lugares deseja reservar? ");
                    int qtd = sc.nextInt();

                    if (evento.reservar(qtd)) {
                        System.out.println("Reserva realizada com sucesso!");
                    } else {
                        System.out.println("Não foi possível realizar a reserva.");
                    }
                }

                case 2 -> {
                    System.out.print("Quantos lugares deseja cancelar? ");
                    int qtd = sc.nextInt();

                    if (evento.cancelar(qtd)) {
                        System.out.println("Reserva cancelada com sucesso!");
                    } else {
                        System.out.println("Não foi possível cancelar a reserva.");
                    }
                }

                case 3 -> evento.mostrarStatus();

                case 4 -> {
                    System.out.println("Encerrando o sistema...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Opção inválida!");
            }
        }
    }
}
