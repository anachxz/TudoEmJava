package Matriz; // Define o pacote onde esta classe está localizada

// Classe de exemplo que mostra várias operações com matrizes (arrays bidimensionais)
public class Matriz_Exemplo_1 {

    // Método principal: ponto de entrada da aplicação
    public static void main(String[] args) {

        // Declara e inicializa uma matriz 3x3 com valores de 1 a 9
        int[][] matriz = {
                {1, 2, 3},   // linha 0
                {4, 5, 6},   // linha 1
                {7, 8, 9}    // linha 2
        };

        System.out.println("Exemplo 1 - Imprimindo matriz 3x3 ");

        // Percorre as linhas da matriz (índices 0, 1 e 2)
        for (int linha = 0; linha < 3; linha++) {
            // Percorre as colunas da matriz (índices 0, 1 e 2)
            for (int coluna = 0; coluna < 3; coluna++) {
                // Imprime o elemento da posição [linha][coluna]
                // Obs.: usando println, cada elemento sai em uma linha separada
                System.out.println(matriz[linha][coluna] + " ");
            }
            // Imprime uma linha em branco para separar visualmente as linhas da matriz
            System.out.println();
        }

        System.out.println("\n-------------------\n");

        // Declara uma matriz 2x3 de inteiros sem valores iniciais
        int[][] tabela = new int[2][3];

        // Preenche manualmente cada posição da matriz "tabela"
        tabela[0][0] = 10;
        tabela[0][1] = 20;
        tabela[0][2] = 30;
        tabela[1][0] = 40;
        tabela[1][1] = 50;
        tabela[1][2] = 60;

        System.out.println("Exemplo 2 - Preenchendo matriz manualmente");

        // Percorre as linhas da matriz "tabela" (0 e 1)
        for (int i = 0; i < 2; i++) {
            // Percorre as colunas da matriz "tabela" (0, 1 e 2)
            for (int j = 0; j < 3; j++) {
                // Imprime o elemento da posição [i][j]
                System.out.println(tabela[i][j] + " ");
            }
            // Linha em branco para separar visualmente as linhas da matriz
            System.out.println();
        }

        System.out.println("\n-------------------\n");

        // Declara e inicializa uma matriz 2x2 chamada "dados"
        int[][] dados = {
                {5, 10},   // linha 0
                {15, 20}   // linha 1
        };

        // Variável acumuladora para somar todos os elementos da matriz "dados"
        int soma = 0;

        // Percorre todas as linhas da matriz "dados"
        for (int i = 0; i < dados.length; i++) {
            // Para cada linha, percorre todas as colunas daquela linha
            // Usar dados[i].length deixa o código genérico para qualquer número de colunas
            for (int j = 0; j < dados[i].length; j++) {
                // Soma o valor da posição [i][j] à variável "soma"
                soma += dados[i][j];
            }
        }

        // Imprime o resultado da soma de todos os elementos da matriz "dados"
        System.out.println("Exemplo 3 - Soma de todos os elementos da matriz: " + soma);

        System.out.println("\n---------------------\n");

        // Declara e inicializa uma matriz 2x3 chamada "numeros"
        int[][] numeros = {
                {7, 2, 9},  // linha 0
                {1, 6, 3}   // linha 1
        };

        // Considera inicialmente que o maior elemento é o da posição [0][0]
        int maior = numeros[0][0];

        // Percorre todas as linhas da matriz "numeros"
        for (int i = 0; i < numeros.length; i++) {
            // Para cada linha, percorre todas as colunas daquela linha
            // Aqui é importante usar numeros[i].length, pois a matriz tem 3 colunas
            for (int j = 0; j < numeros[i].length; j++) {
                // Se o elemento atual for maior do que o valor armazenado em "maior"
                if (numeros[i][j] > maior) {
                    // Atualiza "maior" com o novo valor encontrado
                    maior = numeros[i][j];
                }
            }
        }

        // Imprime o maior número encontrado na matriz "numeros"
        System.out.println("Exemplo 4 - Maior número da matriz: " + maior);

        System.out.println("\n---------------------\n");

        // Declara e inicializa uma matriz 3x3 (matriz quadrada)
        int[][] quadrada = {
                {1, 2, 3},  // linha 0
                {4, 5, 6},  // linha 1
                {7, 8, 9}   // linha 2
        };

        System.out.println("Exemplo 5 - Diagonal principal da matriz: ");

        // A diagonal principal de uma matriz quadrada é formada pelos elementos:
        // [0][0], [1][1], [2][2], ..., [n][n]
        // Por isso usamos o mesmo índice "i" tanto para linha quanto para coluna
        for (int i = 0; i < quadrada.length; i++) {
            // Imprime o elemento da diagonal principal na posição [i][i]
            System.out.println(quadrada[i][i]);
        }
    }
}
