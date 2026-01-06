package POO_Heranca_Multipla;

/*
 * Interface Mae
 *
 * Assim como a interface Pai, esta interface representa
 * outro "contrato" de comportamento que pode ser herdado.
 */
public interface Mae {

    /*
     * Método default com implementação própria.
     *
     * Esse método poderá ser acessado por qualquer classe
     * que implemente esta interface.
     */
    default void imprimirDadosCasaMae() {
        System.out.println("----- Dados casa Mãe -----");
        System.out.println("Código 2: ");
        System.out.println("Proprietário: Ana Beatriz");
        System.out.println("Estado: São Paulo");
        System.out.println("Cidade: Sorocaba");
        System.out.println("Valor: R$650.000,00");
        System.out.println();
        System.out.println();
    }
}
