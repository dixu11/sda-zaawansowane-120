package obiektowe.inheritance.animals;

import obiektowe.inheritance.interfaces.FarmAnimal;
import obiektowe.inheritance.interfaces.LandCreature;

public class Cow extends Animal implements LandCreature, FarmAnimal, Comparable<Cow>{


    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public int compareTo(Cow otherCow) {
        int ageCompare = age - otherCow.age;
        if (ageCompare == 0) {
            return name.compareTo(otherCow.name);
        }
        return ageCompare;
    }

    @Override
    public void makeSound() {
        System.out.println("Muuuuu!");
    }







    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
