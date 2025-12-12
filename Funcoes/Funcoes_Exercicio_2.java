// ===== Funcoes_Exercicio_2 =====
package Funcoes; // Define que esta classe pertence ao pacote "Funcoes"

public class Funcoes_Exercicio_2 { // Declara a classe do exercício 2

    public static int fatorial(int numero) { // Função que calcula o fatorial de um número
        int resultado = 1; // Começa com 1 porque é o elemento neutro da multiplicação

        for (int i = 2; i <= numero; i++) { // Multiplica do 2 até o número informado
            resultado = resultado * i; // Atualiza o resultado acumulando a multiplicação
        }

        return resultado; // Retorna o valor final do fatorial
    }

    public static void main(String[] args) { // Método principal (onde o programa executa)
        System.out.println("Fatorial de 5: " + fatorial(5)); // Chama a função e mostra o resultado
    }
}
