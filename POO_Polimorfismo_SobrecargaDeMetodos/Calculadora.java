package POO_Polimorfismo_SobrecargaDeMetodos;

// Classe responsável por realizar operações matemáticas
public class Calculadora {

    // Método somar que recebe uma quantidade variável de números inteiros
    // (uso de varargs: int... numeros)
    public int somar(int... numeros) {
        int soma = 0;

        // Percorre todos os valores inteiros recebidos
        for (int n : numeros) {
            soma += n;
        }

        // Retorna o resultado da soma dos inteiros
        return soma;
    }

    // Sobrecarga do método somar, agora recebendo números do tipo double
    public double somar(double... numeros) {
        double soma = 0;

        // Percorre todos os valores decimais recebidos
        for (double n : numeros) {
            soma += n;
        }

        // Retorna o resultado da soma dos valores double
        return soma;
    }
}
