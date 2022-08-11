package obiektowe.escapeRoom;

public interface GameInteractions {
    boolean hasPlayerGotItem(Item item);

    void addItemToPlayer(Item item);

    void endGame();

    void removeItemFromRoom(Item item);

}
