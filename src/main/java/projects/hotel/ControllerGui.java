package projects.hotel;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class ControllerGui {

    private UserService userService = new UserService();
    private boolean running = true;

    public void startMenu() {
        //przywitanie
        JOptionPane.showMessageDialog(null,"Witaj w programie do obsługi hotelu!");

        do {
            try {
                String stringInput = JOptionPane.showInputDialog(getMenuText());
                int input = Integer.parseInt(stringInput)  ;
                executeSelection(input);
            } catch (UserServiceException e) {
                System.out.println(e.getMessage());
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

    private int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
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
                System.out.println("Narazie!");
                running = false;
                break;
            default:
                System.out.println("Nie rozpoznano decyzji");
        }
    }


    private void showRooms( List<Room> rooms ) {
        String roomsDisplay = "";
        for (Room room : rooms) {
            roomsDisplay += room.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null,roomsDisplay);
    }

    private void bookRoom() throws UserServiceException {
        System.out.println("Który pokój chciałbyś zarezerwować?");
        showRooms(userService.getNotOccupiedRooms());
        Scanner scanner = new Scanner(System.in);
        int selectedRoomNumber = scanner.nextInt();
        System.out.println("Wybrałeś: " + selectedRoomNumber);
        userService.bookRoom(selectedRoomNumber);
        System.out.println("Pokój poprawnie zarezerwowany");
    }

}
