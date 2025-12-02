package Set;

import java.util.HashMap;
import java.util.Map;

public class Set_Exercicio_Map_1 {
    public static void main(String[] args) {

        // Cria um Map onde tanto a chave quanto o valor são Strings
        Map<String,String> tradutor = new HashMap<>();

        // Adiciona traduções ao Map (Português -> Inglês)
        tradutor.put("Menina","Girl");
        tradutor.put("Menino","Boy");
        tradutor.put("Homem","Man");
        tradutor.put("Mulher","Woman");
        tradutor.put("Criança","Kid");

        // Exibe todas as traduções cadastradas
        System.out.println("Traduções português para inglês: " + tradutor);

        // Insere uma nova tradução
        tradutor.put("Lua","Moon");
        System.out.println("Após atualização: " + tradutor);

        // Remove a tradução associada à chave "Menina"
        tradutor.remove("Menina");
        System.out.println("Após remover 'Menina': " + tradutor);

        System.out.println("\nLista de traduções: ");

        // Percorre todas as entradas do Map exibindo chave e valor
        for (Map.Entry<String,String> entry : tradutor.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Tradução: " + entry.getValue());
        }

        // Exibe todas as chaves cadastradas
        System.out.println("Chaves: " + tradutor.keySet());

        // Exibe todos os valores cadastrados
        System.out.println("Valores: " + tradutor.values());

        // Limpa o Map removendo todos os elementos
        tradutor.clear();
        System.out.println("Após limpar: " + tradutor);

    }
}
