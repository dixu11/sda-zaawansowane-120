package projects.hotel;

import java.util.ArrayList;
import java.util.List;

//Klasa dostępu do danych (repozytorium/DAO)
public class Hotel {

    private List<Room> rooms = new ArrayList<>();

    public Hotel() {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room());
        }
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Room> getNotOccupiedRooms() {
        List<Room> result = new ArrayList<>();
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                result.add(room);
            }
        }
        return result;
    }
}
