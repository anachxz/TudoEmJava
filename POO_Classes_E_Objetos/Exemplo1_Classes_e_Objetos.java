package POO.Classes_e_Objetos; // Define que esta classe pertence ao pacote POO

import java.util.Scanner; // Importa a classe Scanner para leitura de dados pelo teclado

public class Exemplo1_Classes_e_Objetos { // Declara a classe principal do exemplo

    public static void main() { // Método principal (ponto de entrada do programa)
        Scanner teclado = new Scanner(System.in); // Cria um objeto Scanner para ler dados do usuário

        System.out.println("Digite o nome do carro: "); // Solicita o nome do carro
        String nome = teclado.nextLine(); // Lê o nome digitado

        System.out.println("Digite o modelo do carro: "); // Solicita o modelo do carro
        String modelo = teclado.nextLine(); // Lê o modelo digitado

        System.out.println("Digite o ano do carro: "); // Solicita o ano do carro
        int ano = teclado.nextInt(); // Lê o ano digitado

        Carro meuCarro = new Carro(nome, modelo, ano); // Cria um objeto da classe Carro usando o construtor

        meuCarro.exibirInformacoes(); // Chama o método que exibe as informações do carro
    }
}

class Carro { // Declara a classe Carro (modelo do objeto)
    String nome; // Atributo que armazena o nome do carro
    String modelo; // Atributo que armazena o modelo do carro
    int ano; // Atributo que armazena o ano do carro

    Carro(String nome, String modelo, int ano) { // Construtor da classe Carro
        this.nome = nome; // Atribui o nome recebido ao atributo da classe
        this.modelo = modelo; // Atribui o modelo recebido ao atributo da classe
        this.ano = ano; // Atribui o ano recebido ao atributo da classe
    }

    void exibirInformacoes(){ // Método que exibe as informações do carro
        System.out.println("\n==== INFORMAÇÕES DO CARRO ==="); // Cabeçalho
        System.out.println("Nome: " + nome); // Exibe o nome do carro
        System.out.println("Modelo: " + modelo); // Exibe o modelo do carro
        System.out.println("Ano: " + ano); // Exibe o ano do carro
        System.out.println("============================="); // Rodapé
    }
}
