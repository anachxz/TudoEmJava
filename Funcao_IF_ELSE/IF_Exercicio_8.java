package ExerciciosIF; // Define o pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class IF_Exercicio_8 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que digite duas notas
        System.out.println("Digite suas duas notas \nNota1: \nNota2:  ");
        double nota1, nota2;
        nota1 = sc.nextDouble(); // Lê a primeira nota
        nota2 = sc.nextDouble(); // Lê a segunda nota

        // Calcula a média
        double media = (nota1 + nota2) / 2;
        System.out.println("Sua média foi: " + media);

        // Pergunta se o usuário quer saber a classificação
        System.out.println("Quer saber sua classificação de acordo com sua média? (sim/não)");
        String classificacao = sc.next().toLowerCase(); // Lê a resposta e converte para minúsculas

        // Se o usuário respondeu "sim", mostra a classificação
        if (classificacao.equals("sim")) {
            System.out.println("=== Classificação ===");

            // Verifica a média e mostra o resultado
            if (media >= 7.0) {
                System.out.println("APROVADO!");
            } else if (media >= 5.0 && media < 7.0) {
                System.out.println("RECUPERAÇÃO!");
            } else {
                System.out.println("REPROVADO!");
            }
        } else {
            System.out.println("Ok! Programa encerrado.");
        }
    }
}