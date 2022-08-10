package obiektowe.escapeRoom;

import java.util.List;

//Klasa zarządzająca zasadami gry i działaniem rozgrywki
public class Game {

    private Room room = new Room();
    private final Player player = new Player();

    public List<Item> getItems() {
       return room.getItems();
    }

    public String useItem(int itemIndex) {
        Item item = room.findItemByIndex(itemIndex);
       return item.use(room, player);
    }

    public int howManyItems() {
        return getItems().size();
    }
}
