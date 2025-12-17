package Encapsulamento;

import java.util.Scanner;

public class Exemplo2_Encapsulamento {
    public static void main(String[] args) {

        // Scanner para entrada de dados pelo teclado
        Scanner entrada = new Scanner(System.in);

        // Solicita e lê o nome do titular
        System.out.println("Digite o nome do titular: ");
        String nome = entrada.nextLine();

        // Solicita e lê o CPF do titular
        System.out.println("Digite o cpf do titular(somente números): ");
        String cpf = entrada.nextLine();

        // Solicita e lê o saldo inicial
        System.out.println("Digite o saldo inicial: ");
        double saldoInicial = entrada.nextDouble();

        // Cria o objeto ContaBancaria usando o construtor
        ContaBancaria conta = new ContaBancaria(nome, cpf, saldoInicial);

        // Exibe o resumo inicial da conta
        conta.exibirResumo();

        // Realiza um depósito de R$100
        conta.depositar(100);
        System.out.println("\n Após deposito R$ 100: ");
        conta.exibirResumo();

        // Tenta realizar um saque de R$50
        boolean saque1 = conta.sacar(50.0);

        // Verifica se o saque foi realizado com sucesso
        if (saque1) {
            System.out.println("\n Saque de R$ 50 realizado com sucesso!");
        } else {
            System.out.println("\n Falha ao tentar sacar R$ 50");
        }

        // Exibe o resumo após o saque
        conta.exibirResumo();

        // Tenta realizar um saque maior que o saldo
        boolean saque2 = conta.sacar(10000.0);

        // Verifica se o saque foi possível
        if (saque2) {
            System.out.println("\n Saque de R$ 10000 realizado com sucesso!");
        } else {
            System.out.println("\n Falha ao tentar sacar R$ 10000(saldo insuficiente).");
        }

        // Exibe o resumo após a tentativa de saque
        conta.exibirResumo();

        // Realiza novo depósito
        conta.depositar(500.0);
        System.out.println("\n Após deposito R$ 500: ");
        conta.exibirResumo();

        // Altera o nome do titular usando o setter
        conta.setNomeTitular("Nome titular");
        System.out.println("\nApós altera o nome do titular: ");
        conta.exibirResumo();

        // Fecha o Scanner
        entrada.close();
    }
}
