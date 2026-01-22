package POO_Polimorfismo_SobrecargaDeMetodos;

public class Main {
    public static void main(String[] args) {

        // Instanciação do objeto Calculadora
        Calculadora calc = new Calculadora();

        // Chamada do método somar com dois inteiros
        System.out.println("Soma de 5 + 3 = " + calc.somar(5, 3));

        // Chamada do método somar com três inteiros
        System.out.println("Soma de 5 + 3 + 2 = " + calc.somar(5, 3, 2));

        // Chamada do método somar com vários inteiros
        System.out.println("Soma de 1 + 2 + 3 + 4 + 5 = " + calc.somar(1, 2, 3, 4, 5));

        // Chamada do método somar com valores decimais (double)
        System.out.println("Soma de 2.5 + 3.5 = " + calc.somar(2.5, 3.5));

        // Chamada do método somar com vários doubles
        System.out.println("Soma de 1.1 + 2.2 + 3.3 + 4.4 = " + calc.somar(1.1, 2.2, 3.3, 4.4));
    }
}
