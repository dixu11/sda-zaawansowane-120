package projects.hotel;

import java.util.List;

//Logika biznesowa - do niej zwraca się Controller aby zleci pewną pracę aplikacji np. rezerwacja pokoju
public class UserService {

    private Hotel hotel = new Hotel();

    public List<Room> getAllRooms() {
        return hotel.getRooms();
    }


}
