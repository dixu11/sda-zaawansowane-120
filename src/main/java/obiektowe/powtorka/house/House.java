package obiektowe.powtorka.house;

import java.util.Arrays;

public class House {
    private final Room[] rooms;

    public House(Room[] rooms) {
        this.rooms = rooms;
    }

    public void tidy(){
        for (Room room : rooms) {
            room.tidy();
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
