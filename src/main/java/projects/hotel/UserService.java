package projects.hotel;

import java.util.List;

//Logika biznesowa - do niej zwraca się Controller aby zleci pewną pracę aplikacji np. rezerwacja pokoju
public class UserService {

    private Hotel hotel = new Hotel();

    public List<Room> getAllRooms() {
        return hotel.getRooms();
    }

    public List<Room> getNotOccupiedRooms() {
        return hotel.getNotOccupiedRooms();
    }

    public void bookRoom(int selectedRoomNumber) throws UserServiceException {
        //potrzebuję pokoju o tym numerze
        Room room = hotel.findRoomByNumber(selectedRoomNumber);
        if (room.isOccupied()) {
            throw new UserServiceException("Ten pokój jest zajęty!");
        }
        room.book();
    }
}
