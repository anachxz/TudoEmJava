package For;

public class For_Exemplo_1 {
    public static void main(String[] args) {

        System.out.println("\n Exemplo 1: Contar de 1 até 10\n");
        // Loop simples contando de 1 até 10, incrementando 1 por vez.
        for(int i = 1; i <= 10; i++){
            System.out.println("Valor de i: "+i);
        }

        System.out.println("\n Exemplo 2: Contar de 10 até 1(Ordem decrescente)\n");
        // Agora o loop faz o contrário: começa em 10 e vai descendo até 1.
        for(int i = 10; i >= 1; i--){
            System.out.println("Contando ao contrário: "+i);
        }

        System.out.println("\n Exemplo 3: Mostrar apenas números de 2 a 20\n");
        // Aqui o pulo do gato: i começa em 2 e vai somando 2, mostrando apenas pares.
        for(int i = 2; i <= 20; i+=2){
            System.out.println("Números pares: "+i);
        }

        System.out.println("\n Exemplo 4: Somar todos os números de 1 a 100\n");
        int soma=0;
        // Loop que soma todos os números de 1 até 100 dentro da variável soma.
        // A cada repetição ele mostra como a soma está ficando.
        for(int i = 1; i <= 100; i++){
            soma+=i; // soma = soma + i
            System.out.println("Soma: "+soma);
        }

        // Ao final, exibe o resultado final da soma.
        System.out.println("Soma de 1 a 100 é: "+soma);
    }
}
