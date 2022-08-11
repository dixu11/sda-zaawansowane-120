package obiektowe.escapeRoom;

public class Key extends Item {

    public Key() {
        super("Klucz");
    }

    @Override
    public String use(GameInteractions gameInteractions) {
        gameInteractions.removeItemFromRoom(this);
        gameInteractions.addItemToPlayer(this);
        return "Zabierasz klucz";
    }
}
