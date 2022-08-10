package obiektowe.escapeRoom;

import java.util.List;

//Klasa zarządzająca zasadami gry i działaniem rozgrywki
public class Game {

    private Room room = new Room();

    public List<Item> getItems() {
       return room.getItems();
    }

    public String useItem(int itemIndex) {
        Item item = room.findItemByIndex(itemIndex);
       return item.use();
    }

    public int howManyItems() {
        return getItems().size();
    }
}
