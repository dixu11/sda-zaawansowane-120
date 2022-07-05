package obiektowe.inheritance;

import java.util.ArrayList;
import java.util.List;

public class AnimalsDemo {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Monkey monkey2 = new Monkey("Filutek",4,15);

        Whale whale = new Whale();
        Whale whale2 = new Whale("Radek",45,7);

        monkey.jump();
        monkey.uhaha();

        whale.booing();
        whale.swim();

        //wspólna metoda:
        monkey.eat();
        whale.eat();

        //wspólna lista
        List<Animal> animals = new ArrayList<>();
        animals.add(monkey);
        animals.add(monkey2);
        animals.add(whale);
        animals.add(whale2);

        for (Animal animal : animals) {
            animal.eat();
        }

        System.out.println("-------------Animal Guide -----------");
        AnimalGuide animalGuide = new AnimalGuide();
        animalGuide.feedMonkey(monkey);
        animalGuide.feedWhale(whale);








    }
}
