//Declara o pacote onde a classe está localizada
//Paoctes sao usados para organizar classes relacionados a grupos logicos
// Aqui estamos dizendo que esta classe pertence ao pacote "logica"

package logica;
//Declaracao da classe publica chamada "OlaMundo".
//Em java todo programa e construido em torno de classes
// acessada a qualquer outra classe
// o nome da classe deve ser o mesmo nome do arquivo(OlaMundo.java)
// com a primeira letra maiúcula por convenção

public class OlaMundo {
// Este é metodo principal(main) do programa, o ponto de partida da aplicação java.
// quando voce executa um programa java, o metodo main é o primeiro a ser chamado.
//"public" significa que esse metodo pode ser chamado por qualquer parte do programa.
//"static" significa que ele pode ser chamado sem criar um objeto de classe.
// "void" significa que este metodo não retorna a nenhum valor
//"String[]args" é  um parametro que representa uma lista(vetor) de strings, que pode
// ser usado para receber argumentos de linha de comando, se desejado.

    public static void main(String[] args) {
// Comando que imprime uma de texto no console(terminal)
        // "System" é uma classe da biblioteca padrao do java.
        //"out" é um objeto de saide(output) da classe System, que
        // representa o console
        // "println" é um método que imprime a mensagem e pula uma linha ao final.
        // A mensagem "Olá, Mundo!" está entre aspas duplas porque é uma String(texto)
        System.out.println("Ola, Mundo! ");
    }}
    /* o que voce aprendeu com esse código:
    - como declarar um pacote
    -como declarar uma classe pública
    - como escrever o método principal main
    -como usar System.out.println para imprimir algo na tela
- A estrutura básica de um programa Java /*
     */

