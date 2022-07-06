package obiektowe.inheritance.animals;

import obiektowe.inheritance.interfaces.FarmAnimal;
import obiektowe.inheritance.interfaces.LandCreature;

public class Cow extends Animal implements LandCreature, FarmAnimal {


    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Muuuuu!");
    }
}
