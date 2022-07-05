package obiektowe.inheritance.animals;

public class Monkey extends Animal{

    private int tailLength;

    public Monkey(String name, int age, int tailLength) {
        super(name,age);
        this.tailLength = tailLength;
    }
    
    public Monkey(){
        super("Jacek",8);
        tailLength = 20;
    }

    //konstruktory nie dziedzedzicza sie - sa synchronizowane
    //konstruktory klas niżej w dziedziczeniu (Monkey) dopisują instrukcje "super()"
    //wywołuje ona domyślny konstruktor z klasy wyżej
    //jeśli takiego nie ma - kod się podkreśla - trzeba dodać parametry

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
