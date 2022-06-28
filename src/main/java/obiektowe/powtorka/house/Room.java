package obiektowe.powtorka.house;

import java.util.Arrays;

public class Room {

   private final Bed bed;
   private final Window[] windows;


    public Room(Bed bed, Window[] windows) {
        this.bed = bed;
        this.windows = windows;
    }

   public Room (){
       bed = new Bed(5);
       windows = new Window[2];
       windows[0] = new Window();
       windows[1] = new Window();
   }

   public void tidy(){
        bed.clean();
       for (Window window : windows) {
           window.doOpen();
       }
   }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", windows=" + Arrays.toString(windows) +
                '}';
    }
}
