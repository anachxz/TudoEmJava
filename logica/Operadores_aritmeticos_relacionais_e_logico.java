// Define o pacote onde a classe está localizada
package logica;

// Declaração da classe pública chamada Operadores_aritmeticos_relacionais_e_logico
public class Operadores_aritmeticos_relacionais_e_logico {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {
        // Chama o método que mostra operadores aritméticos
        mostrarOperadoresAritmeticos();

        // Imprime uma linha separadora para organização visual
        System.out.println("---------------------");

        // Chama o método que mostra operadores relacionais
        mostrarOperadoresRelacionais();

        // Imprime outra linha separadora
        System.out.println("---------------------");

        // Chama o método que mostra operadores lógicos
        mostrarOperadoresLogicos();
    }

    // Método que demonstra operadores aritméticos
    public static void mostrarOperadoresAritmeticos() {
        // Declara duas variáveis inteiras
        int a = 10;
        int b = 3;

        // Exibe a soma dos dois números
        System.out.println("Soma: " + (a + b));

        // Exibe a subtração dos dois números
        System.out.println("Subtração: " + (a - b));

        // Exibe a multiplicação dos dois números
        System.out.println("Multiplicação: " + (a * b));

        // Exibe a divisão inteira dos dois números
        System.out.println("Divisão: " + (a / b));

        // Exibe o resto da divisão (módulo)
        System.out.println("Resto da divisão: " + (a % b));
    }

    // Método que demonstra operadores relacionais
    public static void mostrarOperadoresRelacionais() {
        // Declara duas variáveis inteiras
        int x = 10;
        int y = 20;

        // Compara se x é igual a y
        System.out.println("x é == a y? " + (x == y));

        // Compara se x é diferente de y
        System.out.println("x é != a y? " + (x != y));

        // Compara se x é maior que y
        System.out.println("x é > que y? " + (x > y));

        // Compara se x é menor que y
        System.out.println("x é < que y? " + (x < y));

        // Compara se x é maior ou igual a y
        System.out.println("x é >= a y? " + (x >= y));

        // Compara se x é menor ou igual a y
        System.out.println("x é <= a y? " + (x <= y));
    }

    // Método que demonstra operadores lógicos
    public static void mostrarOperadoresLogicos() {
        // Declara uma variável inteira representando idade
        int idade = 18;

        // Declara uma variável booleana indicando se tem carteira
        boolean temCarteira = true;

        // Verifica se pode dirigir (idade >= 18 E tem carteira)
        boolean podeDirigir = (idade >= 18) && temCarteira;

        // Verifica se pode viajar sozinho (mesma lógica)
        boolean podeViajarSozinho = (idade >= 18) && temCarteira;

        // Verifica se NÃO tem carteira (negação)
        boolean naoTemCarteira = !temCarteira;

        // Exibe os resultados das verificações
        System.out.println("Pode dirigir? " + podeDirigir);
        System.out.println("Pode viajar sozinho? " + podeViajarSozinho);
        System.out.println("Não tem carteira? " + naoTemCarteira);
    }
}
