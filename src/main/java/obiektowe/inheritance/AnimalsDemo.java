package obiektowe.inheritance;

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


    }
}
