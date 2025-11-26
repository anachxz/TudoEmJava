package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Listas_Exemplo_7 {
    public static void main(String[] args) {

        // Lista criada pelo método tradicional, usando for
        ArrayList<Integer> dobrosTradicional = new ArrayList<>();

        // Loop tradicional gerando os números dobrados de 0 a 4
        for (int numero = 0; numero < 5; numero++) {

            // Calcula o dobro do número atual
            int dobro = numero * 2;

            // Adiciona o valor calculado à lista
            dobrosTradicional.add(dobro);
        }

        // Exibe a lista gerada pelo for tradicional
        System.out.println("Dobros com for tradicional: " + dobrosTradicional);


        // Criando a mesma lista usando Stream API (estilo list comprehension)
        ArrayList<Integer> dobrosComStream = IntStream.range(0, 5) // gera números de 0 a 4
                .map(x -> x * 2)                                   // aplica a função (dobro)
                .boxed()                                           // converte int para Integer
                .collect(Collectors.toCollection(ArrayList::new)); // coleta em um ArrayList

        System.out.println("Dobros com list comprehension (Stream): " + dobrosComStream);


        // Versão ainda mais enxuta, coletando diretamente para List
        System.out.println(
                "Dobros com list comprehension (enxuto): " +
                        IntStream.range(0, 5)      // sequência 0–4
                                .map(x -> x * 2)    // dobrando valores
                                .boxed()            // transforma para Integer
                                .toList()           // coleta em uma lista imutável
        );
    }
}
