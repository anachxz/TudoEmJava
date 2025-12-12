package Funcoes;

public class Funcoes_Exemplo_1 {

    // Função sem parâmetros e sem retorno. Apenas exibe uma mensagem.
    public static void mensagemBoasVindas(){
        System.out.println("Bem-vindo ao mundo das funções em Java!");
    }

    // Função que recebe um nome como parâmetro e exibe uma saudação personalizada.
    public static void saudar(String nome){
        System.out.println("Olá " + nome + " ! É um prazer te ver aqui!");
    }

    // Função que recebe dois números inteiros e retorna a soma deles.
    public static int somar(int a, int b){
        return a + b;
    }

    // Função que verifica se um número é par. Retorna true se for, false se não for.
    public static boolean ehPar(int numero){
        return numero % 2 == 0;
    }

    // Função que calcula o quadrado de um número inteiro.
    public static int quadrado(int numero){
        return numero * numero;
    }

    public static void main(String[] args) {

        // Chama a função de boas-vindas
        mensagemBoasVindas();
        System.out.println("\n----------------------------------\n");

        // Chama a função que exibe uma saudação com nome
        saudar("Clevison");
        System.out.println("\n----------------------------------\n");

        // Chama a função somar e guarda o resultado em uma variável
        int resultadoSoma = somar(10, 5);
        System.out.println("A soma de 10 + 5 é: " + resultadoSoma);
        System.out.println("\n----------------------------------\n");

        // Testa a função ehPar com o número 8
        int numeroTeste = 8;
        boolean resultadoPar = ehPar(numeroTeste);
        System.out.println("O número " + numeroTeste + " é par? " + resultadoPar);
        System.out.println("\n----------------------------------\n");

        // Testa a função quadrado com o número 6
        int numeroQuadrado = 6;
        int resultadoQuadrado = quadrado(numeroQuadrado);
        System.out.println("O quadrado de " + numeroQuadrado + " é: " + resultadoQuadrado);
    }
}
