package obiektowe.inheritance.animals;

public class Cow extends Animal{


    public Cow (String name,int age){
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Muuuuu!");
    }
}
