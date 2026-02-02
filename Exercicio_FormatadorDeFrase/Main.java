package Exercicio_FormatadorDeFrase;

import java.util.Scanner;

public class Main {

    // Exibe o menu de opções
    private static void mostrarMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Converter para MAIÚSCULAS");
        System.out.println("2. Converter para minúsculas");
        System.out.println("3. Capitalizar a primeira letra");
        System.out.println("4. Formato título");
        System.out.println("5. Contar vogais");
        System.out.println("6. Contar consoantes");
        System.out.println("7. Contar letra 'a'");
        System.out.println("8. Pesquisar palavra");
        System.out.println("9. Mostrar frase atual");
        System.out.println("10. Sair");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicita a frase inicial
        System.out.print("Digite uma frase: ");
        FormatadorDeFrase formatador =
                new FormatadorDeFrase(sc.nextLine());

        // Loop principal do programa
        while (true) {
            mostrarMenu();
            System.out.print("Opção: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1" -> {
                    formatador.paraMaiusculas();
                    System.out.println("Frase convertida!");
                }
                case "2" -> {
                    formatador.paraMinusculas();
                    System.out.println("Frase convertida!");
                }
                case "3" -> {
                    formatador.capitalizarPrimeiraLetra();
                    System.out.println("Primeira letra capitalizada!");
                }
                case "4" -> {
                    formatador.formatoTitulo();
                    System.out.println("Formato título aplicado!");
                }
                case "5" -> {
                    System.out.println("Vogais: " + formatador.contarVogais());
                }
                case "6" -> {
                    System.out.println("Consoantes: " + formatador.contarConsoantes());
                }
                case "7" -> {
                    System.out.println("Letra 'a': " + formatador.contarLetraA());
                }
                case "8" -> {
                    System.out.print("Digite a palavra: ");
                    String palavra = sc.nextLine();
                    System.out.println("Ocorrências: "
                            + formatador.contarOcorrencias(palavra));
                }
                case "9" -> {
                    System.out.println("Frase atual: "
                            + formatador.obterFrase());
                }
                case "10" -> {
                    System.out.println("Saindo... até mais!");
                    sc.close();
                    return;
                }
                default ->
                        System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
