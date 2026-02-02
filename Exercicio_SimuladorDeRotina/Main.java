package Exercicio1_Simulando_Rotina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome);

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Acordar");
            System.out.println("2 - Comer");
            System.out.println("3 - Parar de comer");
            System.out.println("4 - Dirigir");
            System.out.println("5 - Parar de dirigir");
            System.out.println("6 - Dormir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    pessoa.acordar();
                    break;
                case 2:
                    pessoa.comer();
                    break;
                case 3:
                    pessoa.pararDeComer();
                    break;
                case 4:
                    pessoa.dirigir();
                    break;
                case 5:
                    pessoa.pararDeDirigir();
                    break;
                case 6:
                    pessoa.dormir();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

    }
}
