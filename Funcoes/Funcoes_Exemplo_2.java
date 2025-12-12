package Funcoes;

public class Funcoes_Exemplo_2 {

    // Exibe uma linha separadora para organização visual no console
    public static void linhaSeparadora(){
        System.out.println("\n--------------------");
    }

    // Repete uma mensagem um número específico de vezes
    public static void repetirMensagem(String mensagem, int vezes){
        for(int i = 0; i < vezes; i++){
            System.out.println(mensagem);
        }
    }

    // Retorna o valor absoluto de um número
    // Se for negativo, multiplica por -1; se for positivo, retorna como está
    public static int valorAbsoluto(int numero){
        if(numero < 0){
            return -numero;
        }
        return numero;
    }

    // Verifica se 'a' é múltiplo de 'b', retornando true ou false
    public static boolean ehMultiplo(int a, int b) {
        return a % b == 0;
    }

    // Retorna a primeira letra de uma string
    public static char primeiraLetra(String nome) {
        return nome.charAt(0);
    }

    public static void main(String[] args) {

        // Exibe linha separadora
        linhaSeparadora();

        // Repete uma mensagem 3 vezes
        repetirMensagem("Estudando funções é divertido!", 3);

        // Nova linha separadora
        linhaSeparadora();

        // Exibe o valor absoluto de um número
        int numero = 3;
        System.out.println("O valor absoluto de " + numero + " é: " + valorAbsoluto(numero));

        // Linha separadora
        linhaSeparadora();

        // Testa se 20 é múltiplo de 5
        int x = 20, y = 5;
        System.out.println(x + " é múltiplo de " + y + " ? " + ehMultiplo(x, y));

        // Linha separadora
        linhaSeparadora();

        // Exibe a primeira letra de um nome
        String nome = "Carlos";
        System.out.println("A primeira letra do nome \"" + nome + "\" é: " + primeiraLetra(nome));

    }
}
