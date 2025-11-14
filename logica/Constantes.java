package logica;
/*
Constantes são valores que não mudam durante a execução do programa
Em Java, usamos palavra-chave "final" para indicar que o valor é fixo
Por convenção, os nomes das constantes são scritos em MAIÚSCULAS.
 */
public class Constantes {
    public static void main(String[] args) {
        //Declara uma constante do tipo double chamada PI com valor de 3.1415
        final double PI = 3.14159;
        //Declara uma constante do tipo inteiro chamado ANO_ATUAL com valor de 2025
        final int ANO_ATUAL= 2025;
        //Imprime no console o texto "Valor de PI:" seguido do valor da constante PI
        System.out.println("Valor de PI: "+PI);
        //Imprime no console o texto "Ano atual:" seguido do valor da constante ANO_ATUAL
        System.out.println("Ano atual: "+ANO_ATUAL);
        //FIM
    }
}
