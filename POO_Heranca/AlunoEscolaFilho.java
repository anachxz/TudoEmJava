package POO_Heranca;

/*
 * - "extends AlunoEscolaPai" significa que ela HERDA os atributos e métodos do pai.
 * - Ou seja: codigo, nome, sexo, idade e imprimirNaTela() já existem aqui automaticamente.
 */
public class AlunoEscolaFilho extends AlunoEscolaPai {

    /*
     * Construtor
     * - Executa automaticamente quando fazemos: new AlunoEscolaFilho()
     * - Aqui a gente inicializa os atributos herdados (do pai) com valores padrão.
     */
    public AlunoEscolaFilho() {
        this.codigo = 1;          // atributo herdado
        this.nome = "Cleonice";   // atributo herdado
        this.sexo = "Feminino";   // atributo herdado
        this.idade = 19;          // atributo herdado
    }
}
