package obiektowe.escapeRoom;

import java.util.ArrayList;
import java.util.List;

//Zarządza przedmiotami
public class Room {
   private List<Item> items = new ArrayList<>();

   public Room(){
      items.add(new Door());
      items.add(new Key());
      items.add(new Window());
   }

   public List<Item> getItems() {
      return items;
   }

}
