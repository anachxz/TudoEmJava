package POO_Heranca_Multipla;

/*
 * Interface Pai
 *
 * Em Java, a herança múltipla NÃO é permitida entre classes.
 * Porém, ela pode ser simulada através de interfaces.
 *
 * Uma interface define apenas comportamentos (métodos),
 * que podem ser implementados por uma mesma classe.
 */
public interface Pai {

    /*
     * Método default:
     * - Desde o Java 8, interfaces podem conter métodos com implementação.
     * - O método default permite reutilização de código sem obrigar
     *   a classe que implementa a interface a sobrescrevê-lo.
     */
    default void imprimirDadosCasaPai() {
        System.out.println("----- Dados casa Pai -----");
        System.out.println("Código 1: ");
        System.out.println("Proprietário: Matheus Alves");
        System.out.println("Estado: Santa Catarina");
        System.out.println("Cidade: Lages");
        System.out.println("Valor: R$500.000,00");
        System.out.println();
        System.out.println();
    }
}
