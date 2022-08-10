package obiektowe.escapeRoom;

public class Key extends Item {

    public Key() {
        super("Klucz");
    }

    @Override
    public String use(Room room, Player player) {
        room.removeItem(this);
        player.add(this);
        return "Zabierasz klucz";
    }
}
