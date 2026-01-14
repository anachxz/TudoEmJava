package POO_Encapsulamento_2;

import POO_Encapsulamento_2.Exemplo;

/*
 * Classe Filha
 *
 * Esta classe HERDA da classe Exemplo utilizando "extends".
 *
 * O objetivo é testar o acesso aos atributos herdados,
 * simulando uma SUBCLASSE.
 */
public class Filha extends Exemplo {

    /*
     * Método de teste
     * - Demonstra quais atributos são acessíveis
     *   a partir de uma subclasse.
     */
    public void testar() {

        System.out.println("=== Testando em SUBCLASSE ===");

        // Atributo public: acesso permitido
        System.out.println(atributoPublico);

        // Atributo default: NÃO é acessível fora da classe/método original
        // System.out.println(atributoDeDefault);

        // Atributo private: NÃO é herdado
        // System.out.println(atributoPrivado);

        // Atributo protected: acesso permitido em subclasses
        System.out.println(atributoProtegido);
    }
}
