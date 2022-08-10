package obiektowe.escapeRoom;

import java.util.ArrayList;
import java.util.List;

//Zarządza przedmiotami
public class Room {
   private List<Item> items = new ArrayList<>();

   public Room(){
      Key key = new Key();
      items.add(new Door(key));
      items.add(key);
      items.add(new Window());
   }

   public List<Item> getItems() {
      return items;
   }

   public Item findItemByIndex(int index){
      return items.get(index);
   }

   public void removeItem(Item item) {
      items.remove(item);
   }

}
