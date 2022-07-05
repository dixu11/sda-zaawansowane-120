package obiektowe.inheritance;

public abstract class Animal {

    public void eat() {
        System.out.println("Zwierze je jedzonko :) ");
    }

    public abstract void makeSound(); // metoda abstrakcyjna nie ma ciała, TRZEBA ją nadpisywać

}
