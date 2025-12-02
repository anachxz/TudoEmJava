package Set;

import java.util.HashMap;
import java.util.Map;

public class Set_Exemplo_Map {
    public static void main(String[] args) {

        // Cria um Map onde a chave é um Integer (ID) e o valor é uma String (nome do produto)
        Map<Integer,String> produtos = new HashMap<>();

        // Adiciona produtos ao Map usando o método put (ID, nome)
        produtos.put(1,"Teclado");
        produtos.put(2,"Mouse");
        produtos.put(3,"Monitor");
        produtos.put(4,"Impressora");

        // Exibe todos os produtos cadastrados
        System.out.println("Produtos: "+produtos);

        // Busca o valor associado à chave 2 (Mouse)
        String produto = produtos.get(2);
        System.out.println("Produto com ID 2: "+produto);

        // Verifica se o Map contém a chave 3
        if(produtos.containsKey(3)){
            System.out.println("O ID existe no MAP");
        }

        // Verifica se algum valor igual a "Monitor" está cadastrado no Map
        if(produtos.containsValue("Monitor")){
            System.out.println("O produto 'Monitor' está cadastrado");
        }

        // Atualiza o valor da chave 4 para outro produto
        produtos.put(4,"Impressora a laser");
        System.out.println("Após atualização: "+produtos);

        // Remove a entrada com chave 1
        produtos.remove(1);
        System.out.println("Após remover ID 1: "+produtos);

        System.out.println("\nLista de produtos: ");

        // Percorre todas as entradas do Map usando entrySet()
        for(Map.Entry<Integer,String> entry : produtos.entrySet()){
            System.out.println("ID: "+entry.getKey()+" -> Produto: "+entry.getValue());
        }

        // Exibe somente as chaves do Map
        System.out.println("Chaves: "+produtos.keySet());

        // Exibe somente os valores do Map
        System.out.println("Valores: "+produtos.values());

        // Limpa o Map, removendo todos os elementos
        produtos.clear();
        System.out.println("Após limpar: "+produtos);

    }
}
