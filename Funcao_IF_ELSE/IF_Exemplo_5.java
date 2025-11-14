package ExerciciosIF; // Define o pacote onde a classe está localizada

public class IF_Exemplo_5 {
    public static void main(String[] args) {
        // Declara uma variável booleana chamada 'temCarteira' e define como false (não tem carteira)
        boolean temCarteira = false;

        // Verifica se NÃO tem carteira de motorista (o operador ! inverte o valor da variável)
        if (!temCarteira) {
            // Se a condição for verdadeira, exibe a mensagem abaixo
            System.out.println("Você não tem carteira de motorista!");
        }
    }
}