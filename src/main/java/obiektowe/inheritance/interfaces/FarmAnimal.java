package obiektowe.inheritance.interfaces;

public interface FarmAnimal {


  // public static final int AGE = 10;

    //konstruktor nie działa a pola są tylko stałymi statycznymi
    /*FarmAnimal(){

    }*/

     void eat();
    public abstract void makeSound();


    //wyjatkowo, jesli dodamy default do motody to może nie być abstrakcyjna
    public default void metoda(){
        System.out.println("hello");
    }



}
