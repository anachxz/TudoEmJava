package POO_Heranca_Multipla;

/*
 * Classe Filho
 *
 * Esta classe demonstra HERANÇA MÚLTIPLA em Java por meio de interfaces.
 *
 * A palavra-chave "implements" permite que uma classe implemente
 * MAIS DE UMA interface ao mesmo tempo.
 */
public class Filho implements Pai, Mae {

    /*
     * A classe Filho não precisa reimplementar os métodos,
     * pois eles já estão definidos como default nas interfaces.
     *
     * Assim, o objeto Filho consegue acessar métodos
     * tanto da interface Pai quanto da interface Mae.
     */
}
