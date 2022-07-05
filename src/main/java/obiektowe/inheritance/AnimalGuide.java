package obiektowe.inheritance;

public class AnimalGuide {

    public void feedMonkey(Monkey monkey){
        System.out.println("Opiekun karmi małpę:");
        monkey.eat();
        monkey.uhaha();
    }


    public void feedWhale(Whale whale){
        System.out.println("Opiekun karmi wieloryba:");
        whale.eat();
        whale.booing();
    }


}
