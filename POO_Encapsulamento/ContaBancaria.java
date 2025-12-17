package Encapsulamento;

public class ContaBancaria {

    // Atributos privados (encapsulamento)
    private String nomeTitular;
    private String cpfTitular;
    private double saldo;

    // Retorna o nome do titular
    public String getNomeTitular() {
        return nomeTitular;
    }

    // Define o nome do titular com validação
    public void setNomeTitular(String novoNome) {
        if (novoNome != null && !novoNome.isBlank()) {
            this.nomeTitular = novoNome.trim();
        } else {
            this.nomeTitular = "Titular não informado";
        }
    }

    // Retorna o CPF mascarado
    public String getCpfTitular() {
        return mascaraCpf(cpfTitular);
    }

    // Define o CPF mantendo apenas números
    public void setCpfTitular(String novoCpf) {
        if (novoCpf == null) {
            this.cpfTitular = "";
        } else {
            this.cpfTitular = novoCpf.replaceAll("\\D", "");
        }
    }

    // Retorna o saldo atual
    public double getSaldo() {
        return saldo;
    }

    // Define o saldo garantindo que não fique negativo
    public void setSaldo(double novoSaldo) {
        this.saldo = Math.max(0.0, novoSaldo);
    }

    // Método para depositar valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    // Método para sacar valor da conta
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    // Retorna o tipo da conta
    public String getTipoConta() {
        return tipoConta;
    }

    // Define o tipo da conta
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    // Retorna a agência
    public String getAgencia() {
        return agencia;
    }

    // Define a agência
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    // Método privado para mascarar o CPF
    private String mascaraCpf(String cpfApenasDigitos) {
        if (cpfApenasDigitos == null || cpfApenasDigitos.length() < 3) {
            return "*** cpf inválido***";
        }
        if (cpfApenasDigitos.length() == 11) {
            return cpfApenasDigitos.substring(0, 3) + ".***.***.**";
        }
        return "***.***.***-**";
    }

    // Exibe um resumo da conta no console
    public void exibirResumo() {
        System.out.println("\n==== REUSMO DA CONTA ====");
        System.out.println("Nome do titular: " + getNomeTitular());
        System.out.println("CPF do titular: " + getCpfTitular());
        System.out.printf("Saldo atual: R$ %.2f%n", getSaldo());
        System.out.println("Agência: " + agencia);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("==================================");
    }

    // Atributos com outros modificadores de acesso
    String tipoConta = "Conta corrente";
    protected String agencia = "0001";

    // Construtor da classe
    public ContaBancaria(String nomeTitular, String cpfTitular, double saldoInicial) {
        setNomeTitular(nomeTitular);
        setCpfTitular(cpfTitular);
        setSaldo(saldoInicial);
    }
}
