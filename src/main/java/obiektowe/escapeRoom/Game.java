package obiektowe.escapeRoom;

import java.util.List;

//Klasa zarządzająca zasadami gry i działaniem rozgrywki
public class Game implements GameEngine, GameInteractions{

    private Room room = new Room();
    private final Player player = new Player();
    private boolean running = true;

    public List<Item> getItems() {
       return room.getItems();
    }

    public String useItem(int itemIndex) {
        Item item = room.findItemByIndex(itemIndex);
       return item.use(this);
    }

    public int howManyItems() {
        return getItems().size();
    }

    public boolean isRunning() {
        return running;
    }

    @Override
    public boolean hasPlayerGotItem(Item item) {
        return player.hasItem(item);
    }

    @Override
    public void addItemToPlayer(Item item) {
        player.add(item);
    }

    public void endGame() {
        running = false;
    }

    @Override
    public void removeItemFromRoom(Item item) {
        room.removeItem(item);
    }
}
