package Exercicio_FormatadorDeFrase;

import java.text.Normalizer;
import java.util.Locale;

public class FormatadorDeFrase {

    // Atributo privado que armazena a frase atual
    private String frase;

    // Construtor: recebe a frase inicial
    public FormatadorDeFrase(String frase) {
        this.frase = frase;
    }

    // Converte toda a frase para letras maiúsculas
    public void paraMaiusculas() {
        this.frase = this.frase.toUpperCase(Locale.ROOT);
    }

    // Converte toda a frase para letras minúsculas
    public void paraMinusculas() {
        this.frase = this.frase.toLowerCase(Locale.ROOT);
    }

    // Capitaliza apenas a primeira letra da frase
    public void capitalizarPrimeiraLetra() {
        if (frase == null || frase.isEmpty()) return;

        frase = frase.substring(0, 1).toUpperCase()
                + frase.substring(1).toLowerCase();
    }

    // Formato título: primeira letra de cada palavra em maiúscula
    public void formatoTitulo() {
        String[] palavras = frase.toLowerCase().split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                resultado.append(palavra.substring(0, 1).toUpperCase())
                        .append(palavra.substring(1))
                        .append(" ");
            }
        }

        frase = resultado.toString().trim();
    }

    // Conta vogais (desconsidera acentos)
    public int contarVogais() {
        String texto = removerAcentos(frase.toLowerCase());
        int total = 0;

        for (char c : texto.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                total++;
            }
        }
        return total;
    }

    // Conta consoantes
    public int contarConsoantes() {
        String texto = removerAcentos(frase.toLowerCase());
        int total = 0;

        for (char c : texto.toCharArray()) {
            if (c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1) {
                total++;
            }
        }
        return total;
    }

    // Conta quantas vezes a letra 'a' aparece (com ou sem acento)
    public int contarLetraA() {
        String texto = removerAcentos(frase.toLowerCase());
        int total = 0;

        for (char c : texto.toCharArray()) {
            if (c == 'a') {
                total++;
            }
        }
        return total;
    }

    // Conta quantas vezes uma palavra aparece na frase
    public int contarOcorrencias(String palavra) {
        String texto = frase.toLowerCase();
        palavra = palavra.toLowerCase();

        int total = 0;
        int index = 0;

        while ((index = texto.indexOf(palavra, index)) != -1) {
            total++;
            index += palavra.length();
        }

        return total;
    }

    // Retorna a frase atual
    public String obterFrase() {
        return frase;
    }

    // Remove acentos de uma String (método utilitário)
    public static String removerAcentos(String texto) {
        if (texto == null) return null;

        String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        return normalizado.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}
