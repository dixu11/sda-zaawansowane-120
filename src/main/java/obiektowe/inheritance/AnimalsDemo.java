package obiektowe.inheritance;

import obiektowe.inheritance.animals.Animal;
import obiektowe.inheritance.animals.Cow;
import obiektowe.inheritance.animals.Monkey;
import obiektowe.inheritance.animals.Whale;

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
        monkey.makeSound();

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
            animal.makeSound();
        }

        System.out.println("-------------Animal Guide -----------");
        AnimalGuide animalGuide = new AnimalGuide();
       // animalGuide.feedMonkey(monkey);
      //  animalGuide.feedWhale(whale);

//        animalGuide.feedAnimal(monkey);
//        animalGuide.feedAnimal(whale);

        animalGuide.feedAnimal(new Cow("Mućka",10));
        //polimorfizm
        System.out.println("------------Polymorphysm -------------");
        Animal animal = new Whale();
        animal.makeSound();
        animal = new Monkey();
        animal.makeSound();
        animal = new Cow("Mućka",5);
        animal.makeSound();
        //zdolność języka obiektowego do umieszczania we wspólnej zmiennej różnych typów obiektów
        //metody takiej zmiennej dostosowują swoje działanie w zależności jak dany obiekt ją nadpisał

        if (animal.getClass().equals(whale)) {//porównanie po klasie
        }


        //Z abstrakcyjnej klasy nie można robić obiektów - nie działa new
        //klasy abstrakcyjne mogą mieć abstrakcyjne metody
//        animal = new Animal();
//        animal.makeSound();

    }
}

//private - tylko w danej klasie
//default - pakiet
//protected - w pakiecie + klasy dziedziczace w innych pakietach
//public - dowolny pakiet


