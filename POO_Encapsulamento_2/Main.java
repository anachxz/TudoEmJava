package POO_Encapsulamento_2;

/*
 * Classe Main
 *
 * Esta classe testa o acesso aos atributos da classe Exemplo
 * estando no MESMO pacote.
 */
public class Main {
    public static void main(String[] args) {

        // Criação do objeto da classe Exemplo
        Exemplo e = new Exemplo();

        System.out.println("=== Testando no MESMO pacote ===");

        // Atributo public: acesso permitido
        System.out.println(e.atributoPublico);

        // Atributo default: acesso permitido (mesmo pacote)
        System.out.println(e.atributoDeDefault);

        // Atributo protected: acesso permitido (mesmo pacote)
        System.out.println(e.atributoProtegido);

        // Atributo private: NÃO pode ser acessado fora da classe
        // System.out.println(e.atributoPrivado);

        System.out.println("\n");

        // Chamada de método público
        // O método acessa inclusive o atributo private internamente
        e.mostrarTudo();
    }
}
