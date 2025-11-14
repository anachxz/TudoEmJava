package logica;

public class Variaveis {

// Declara a classe pública chamada "Variaveis"

    public static void main(String[] args) {

// Método principal que inicia a execução do programa

        /*
         * Explicação geral:
         * Variáveis são espaços na memória que armazenam valores.
         * Cada variável tem um nome, um tipo e (opcionalmente) um valor inicial.
         * Exemplo: int idade = 25; (idade é uma variável do tipo inteiro que começa com o valor 25)
         */


        int idade =25;
// Declara uma variável inteira chamada "idade" com valor inicial 25


        double altura= 1.75;
        // Declara uma variável do tipo double (decimal) chamada "altura" com valor 1.75

        String nome= "João";

// Declara uma variável do tipo texto (String) chamada "nome" com valor "João"

        boolean estudando= true;
// Declara uma variável booleana (verdadeiro ou falso) chamada "estudando" com valor true
        System.out.println("Nome: "+ nome);

        System.out.println("Idade:  "+ idade+" anos");

        System.out.println("Altura: "+ altura+ " metros");

        System.out.println("Está estudando? "+ estudando);
    }
}
