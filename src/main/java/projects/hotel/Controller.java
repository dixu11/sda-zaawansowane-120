package projects.hotel;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

//tutaj schemat interakcji bez szczegółów na co wyświetlamy
public abstract class Controller {



    private UserService userService = new UserService();
    private boolean running = true;

    public void startMenu() {
        //przywitanie
        showMessage("Witaj w programie do obsługi hotelu!");

        do {
            try {
                int input = askQuestion(getMenuText());
                executeSelection(input);
            } catch (UserServiceException e) {
                showMessage(e.getMessage());
            }
        } while (running);

    }

    private String getMenuText() {
        return """
        Co chcesz zrobić?
        1. Pobierz listę wszystkich pokoi
        2. Pobierz listę wszystkich dostępnych pokoi
        3. Rezerwuj pokój (podaj nr pokoju i jeśli jest dostępny to go zarezerwuj)
        4. Zwolnij pokój (podaj nr pokoju i jeśli jest zajęty to go zwolnij)
        5. Zamknij program""";
    }

    private void executeSelection(int input) throws UserServiceException {
        switch (input) {
            case 1:
                showRooms(userService.getAllRooms());
                break;
            case 2:
                showRooms(userService.getNotOccupiedRooms());
                break;
            case 3:
                bookRoom();
                break;
            case 5:
                showMessage("Narazie!");
                running = false;
                break;
            default:
                showMessage("Nie rozpoznano decyzji");
        }
    }


    private void showRooms( List<Room> rooms ) {
        String roomsDisplay = "";
        for (Room room : rooms) {
            roomsDisplay += room.toString() + "\n";
        }
        showMessage(roomsDisplay);
    }

    private void bookRoom() throws UserServiceException {
        showRooms(userService.getNotOccupiedRooms());
        int selectedRoomNumber =askQuestion("Który pokój chciałbyś zarezerwować?");
        userService.bookRoom(selectedRoomNumber);
       showMessage( "Pokój poprawnie zarezerwowany");
    }

    public abstract void showMessage(String message);

    public abstract int askQuestion(String question);


}
