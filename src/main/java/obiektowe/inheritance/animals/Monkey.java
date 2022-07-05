package obiektowe.inheritance.animals;

public class Monkey extends Animal{

    private int tailLength;

    public Monkey(String name, int age, int tailLength) {
        this.name = name;
        this.age = age;
        this.tailLength = tailLength;
    }
    
    public Monkey(){
        name = "Jacek";
        age = 8;
        tailLength = 20;
    }

    public void uhaha() {
        System.out.println("Uhahaha!!!");
    }

    public void jump(){
        System.out.println(name + " skacze w poszukiwaniu banana!");
    }


    public void eat(){
        System.out.println("Małpa je banana!");
    }

    @Override
    public void makeSound() {
        uhaha();
    }
}
