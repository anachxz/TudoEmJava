package Switch_Case; // Define o pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class Switch_Exemplo_1 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar dados digitados pelo usuário
        Scanner sc = new Scanner(System.in);

        // Exibe as opções para o usuário escolher sua cor favorita
        System.out.println("Escolha sua cor favorita: ");
        System.out.println("1 - Azul");
        System.out.println("2 - Verde");
        System.out.println("3 - Vermelho");
        System.out.println("Digite o número da opção: ");

        // Lê a opção escolhida pelo usuário
        int opcao = sc.nextInt();

        // Estrutura switch para verificar qual opção foi escolhida
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a cor azul");
                break; // Interrompe o switch após executar este caso
            case 2:
                System.out.println("Você escolheu a cor verde");
                break;
            case 3:
                System.out.println("Você escolheu a cor vermelha");
                break;
            default:
                // Caso o usuário digite um número fora das opções
                System.out.println("Opção inválida");
        }
    }
}
