package obiektowe.escapeRoom;

public class Window extends Item{
    public Window() {
        super("Window");
    }

    @Override
    public void use() {
        System.out.println("Używam okna");
    }
}
