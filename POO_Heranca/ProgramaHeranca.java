package POO_Heranca;

/*
 * Classe de execução (main)
 * - Aqui a gente cria objetos das classes filhas e usa o método herdado imprimirNaTela().
 */
public class ProgramaHeranca {
    public static void main(String[] args) {

        // Cria um objeto da classe filha (AlunoEscolaFilho)
        // O construtor dela inicializa os atributos herdados do pai.
        AlunoEscolaFilho dadosEscolaFilho = new AlunoEscolaFilho();

        // Chama o método imprimirNaTela(), que foi definido na classe pai
        dadosEscolaFilho.imprimirNaTela();

        // Cria um objeto da outra classe filha (AlunoEscolaNeto)
        AlunoEscolaNeto dadosNeto = new AlunoEscolaNeto();

        // Imprime os dados iniciais do "Allan"
        dadosNeto.imprimirNaTela();

        // Altera atributos (que são herdados do pai e estão públicos)
        dadosNeto.nome = "Alfredo Alves";
        dadosNeto.idade = 38;

        // Imprime novamente para ver as alterações
        dadosNeto.imprimirNaTela();
    }
}
