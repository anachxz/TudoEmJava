package POO_Heranca;

/*
 * Classe PAI (superclasse / classe base)
 * - Centraliza os atributos e comportamentos comuns a todos os tipos de "Aluno".
 * - Tudo que estiver aqui pode ser reaproveitado pelas classes FILHAS via herança.
 */
public class AlunoEscolaPai {

    // Atributos comuns (vão existir também nas classes filhas por herança)
    public int codigo;
    public String nome;
    public String sexo;
    public int idade;

    /*
     * Método comum (comportamento) reutilizado por todas as subclasses.
     * As classes filhas podem chamar esse método diretamente, pois herdam ele.
     */
    public void imprimirNaTela() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
        System.out.println(); // quebra de linha para separar blocos de impressão
    }
}
