package projects.hotel;

import java.util.List;
import java.util.Scanner;

//interfejs aplikacji
//TYLKO TUTAJ SOUT + SCANNER
public class Controller {

    private UserService userService = new UserService();
    private boolean running = true;

    public void startMenu() {
        //przywitanie
        System.out.println("Witaj w programie do obsługi hotelu!");
        System.out.println("Co chcesz zrobić?");

        do {
            try {
                showMenu();
                int input = readInput();
                executeSelection(input);
            } catch (UserServiceException e) {
                System.out.println(e.getMessage());
            }
        } while (running);

    }

    private void showMenu() {
        System.out.println("1. Pobierz listę wszystkich pokoi");
        System.out.println("2. Pobierz listę wszystkich dostępnych pokoi");
        System.out.println("3. Rezerwuj pokój (podaj nr pokoju i jeśli jest dostępny to go zarezerwuj)");
        System.out.println("4. Zwolnij pokój (podaj nr pokoju i jeśli jest zajęty to go zwolnij)");
        System.out.println("5. Zamknij program");
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
        for (Room room : rooms) {
            System.out.println(room);
        }
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

  /*  private void showAllRooms() {
        List<Room> rooms = userService.getAllRooms();
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    private void showNotOccupiedRooms() {
        List<Room> rooms = userService.getNotOccupiedRooms();
        for (Room room : rooms) {
            System.out.println(room);
        }
    }*/



//    1. Pobierz listę wszystkich pokoi.
//    2. Pobierz listę wszystkich dostępnych pokoi.
//    3. Rezerwuj pokój (podaj nr pokoju i jeśli jest dostępny to go zarezerwuj).
//    4. Zwolnij pokój (podaj nr pokoju i jeśli jest zajęty to go zwolnij).

}
