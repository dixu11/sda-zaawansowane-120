package obiektowe.escapeRoom;

import java.util.List;

public interface GameEngine {
    boolean isRunning();

    List<Item> getItems();

    int howManyItems();

    String useItem(int index);
}
