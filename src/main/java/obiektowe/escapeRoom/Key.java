package obiektowe.escapeRoom;

public class Key extends Item{

    public Key() {
        super("Klucz");
    }

    @Override
    public void use() {
        System.out.println("Używam klucza");
    }
}
