package obiektowe.inheritance.animals;

public abstract class Animal {

    String name;
    int age;

   /* public Animal() {
        System.out.println("Animal 1");
    }*/

    public Animal(String name, int age) {
        System.out.println("Animal 2");
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Zwierze je jedzonko :) ");
    }

    public abstract void makeSound(); // metoda abstrakcyjna nie ma ciała, TRZEBA ją nadpisywać

}
