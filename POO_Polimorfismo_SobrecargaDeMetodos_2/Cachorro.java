package POO_Polimorfismo_SobrecargaDeMetodos_2;

 class Cachorro extends Animal {
     @Override
     public void emitirSom(){
         System.out.println("O cachorro late: Au Au!");
     }


}
class Gato extends Animal{
     @Override
    public void emitirSom(){
         System.out.println("O gato mia: Miau! ");
     }
}
