package POO_Polimorfismo_SobrecargaDeMetodos_2;

public class Main {
    public static void main() {
        Animal a1= new Animal();
        Animal a2= new Cachorro();
        Animal a3= new Gato();
        System.out.println("==== Testando o polimofirmo com @Override ===");
        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();

    }
}
