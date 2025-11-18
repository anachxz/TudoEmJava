package Vetores_Arrays;

public class Vetores_Arrays_Exemplo_2 {
    public static void main(String[] args) {

        // Vetor original já preenchido com valores
        int[] original = {10, 20, 30, 40, 50};

        // Criação do vetor que receberá a cópia
        // Ele precisa ter o mesmo tamanho do original
        int[] copia = new int[5];

        // Loop para copiar elemento por elemento
        for (int i = 0; i < original.length; i++) {

            // Copiando o valor da posição 'i' do vetor original
            // para a mesma posição no vetor copia
            copia[i] = original[i];
        }

        // For-each para exibir todos os valores do vetor copiado
        for (int valor : copia) {

            // Mostra cada valor copiado
            System.out.println(valor);
        }
    }
}
