package POO_Heranca;

public class AlunoEscolaNeto extends AlunoEscolaPai {

    /*
     * Construtor
     * - Define valores iniciais para os atributos herdados.
     */
    public AlunoEscolaNeto() {
        this.codigo = 2;          // atributo herdado
        this.nome = "Allan";      // atributo herdado
        this.sexo = "Masculino";  // atributo herdado
        this.idade = 28;          // atributo herdado
    }
}
