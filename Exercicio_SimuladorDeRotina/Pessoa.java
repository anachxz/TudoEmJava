package Exercicio1_Simulando_Rotina;

public class Pessoa {

    // Atributos privados que representam o estado da pessoa
    private String nome;
    private boolean acordado;
    private boolean comendo;
    private boolean dirigindo;

    // Construtor
    // Inicializa todos os estados como false
    public Pessoa(String nome) {
        this.nome = nome;
        this.acordado = false;
        this.comendo = false;
        this.dirigindo = false;
    }

    // Método para acordar
    public void acordar() {
        if (acordado) {
            System.out.println(nome + " já está acordado(a).");
        } else {
            acordado = true;
            System.out.println(nome + " acordou.");
        }
    }

    // Método para comer
    public void comer() {
        if (!acordado) {
            System.out.println(nome + " não pode comer enquanto está dormindo.");
        } else if (dirigindo) {
            System.out.println(nome + " não pode comer enquanto dirige.");
        } else if (comendo) {
            System.out.println(nome + " já está comendo.");
        } else {
            comendo = true;
            System.out.println(nome + " começou a comer.");
        }
    }

    // Método para parar de comer
    public void pararDeComer() {
        if (comendo) {
            comendo = false;
            System.out.println(nome + " parou de comer.");
        } else {
            System.out.println(nome + " não está comendo.");
        }
    }

    // Método para dirigir
    public void dirigir() {
        if (!acordado) {
            System.out.println(nome + " não pode dirigir enquanto está dormindo.");
        } else if (comendo) {
            System.out.println(nome + " não pode dirigir enquanto come.");
        } else if (dirigindo) {
            System.out.println(nome + " já está dirigindo.");
        } else {
            dirigindo = true;
            System.out.println(nome + " começou a dirigir.");
        }
    }

    // Método para parar de dirigir
    public void pararDeDirigir() {
        if (dirigindo) {
            dirigindo = false;
            System.out.println(nome + " parou de dirigir.");
        } else {
            System.out.println(nome + " não está dirigindo.");
        }
    }

    // Método para dormir
    public void dormir() {
        if (dirigindo) {
            System.out.println(nome + " não pode dormir enquanto dirige.");
        } else if (comendo) {
            System.out.println(nome + " não pode dormir enquanto come.");
        } else if (!acordado) {
            System.out.println(nome + " já está dormindo.");
        } else {
            acordado = false;
            System.out.println(nome + " foi dormir.");
        }
    }
}
