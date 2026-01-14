package POO_Encapsulamento_2;

/*
 * Classe Exemplo
 *
 * Esta classe demonstra o uso dos modificadores de acesso em Java:
 * private, default (package), protected e public.
 *
 * O objetivo é mostrar como cada modificador afeta o acesso
 * aos atributos dentro da própria classe, no mesmo pacote
 * e em subclasses.
 */
public class Exemplo {

    /*
     * private:
     * - Só pode ser acessado dentro da própria classe.
     * - Não é visível para outras classes, nem mesmo do mesmo pacote.
     */
    private String atributoPrivado = "Sou PRIVATE";

    /*
     * default (sem modificador):
     * - Pode ser acessado apenas por classes do MESMO pacote.
     */
    String atributoDeDefault = "Sou DEFAULT";

    /*
     * protected:
     * - Pode ser acessado por classes do mesmo pacote
     *   e também por subclasses (mesmo que estejam em outro pacote).
     */
    protected String atributoProtegido = "Sou PROTECTED";

    /*
     * public:
     * - Pode ser acessado por qualquer classe, em qualquer pacote.
     */
    public String atributoPublico = "Sou PUBLIC";

    /*
     * Método público
     * - Como está dentro da própria classe,
     *   ele consegue acessar TODOS os atributos,
     *   inclusive o private.
     */
    public void mostrarTudo() {
        System.out.println(atributoPrivado);
        System.out.println(atributoDeDefault);
        System.out.println(atributoProtegido);
        System.out.println(atributoPublico);
    }
}
