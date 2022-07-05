package obiektowe.inheritance.animals;

public class Cow extends Animal{


    public Cow(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Muuuuu!");
    }
}
