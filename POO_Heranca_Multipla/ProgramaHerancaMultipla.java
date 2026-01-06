package POO_Heranca_Multipla;

/*
 * Classe principal (main)
 *
 * Responsável por executar o programa e demonstrar,
 * na prática, o funcionamento da herança múltipla via interfaces.
 */
public class ProgramaHerancaMultipla {
    public static void main(String[] args) {

        // Criação do objeto Filho
        Filho dadosFilho = new Filho();

        // Chamada de método herdado da interface Pai
        dadosFilho.imprimirDadosCasaPai();

        // Chamada de método herdado da interface Mae
        dadosFilho.imprimirDadosCasaMae();
    }
}
