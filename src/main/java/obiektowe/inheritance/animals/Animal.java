package obiektowe.inheritance.animals;

import java.util.Objects;

public abstract class Animal {

    String name;
    int age;

   /* public Animal() {
        System.out.println("Animal 1");
    }*/

    public Animal(String name, int age) {
        //System.out.println("Animal 2");
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Zwierze je jedzonko :) ");
    }

    public abstract void makeSound(); // metoda abstrakcyjna nie ma ciała, TRZEBA ją nadpisywać

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
