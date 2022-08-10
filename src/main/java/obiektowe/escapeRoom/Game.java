package obiektowe.escapeRoom;

import java.util.List;

//Klasa zarządzająca zasadami gry i działaniem rozgrywki
public class Game {

    private Room room = new Room();

    public List<Item> getItems() {
       return room.getItems();
    }

}
