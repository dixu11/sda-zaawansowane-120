package projects.hotel;

import java.util.Scanner;

//interfejs aplikacji
//TYLKO TUTAJ SOUT + SCANNER
public class Controller {

    private UserService userService = new UserService();
    public void startMenu() {



        //przywitanie
        System.out.println("Witaj w programie do obsługi hotelu!");
        System.out.println("Co chcesz zrobić?");

        //opcje
        System.out.println("1. Pobierz listę wszystkich dostępnych pokoi");

        //odpowiedź
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        //wykonanie opcji
        switch (input){
            case 1:
                System.out.println("Wyświetlam dostępne pokoje:");

                break;
            default:
                System.out.println("Nie rozpoznano decyzji");
        }
    }

//    1. Pobierz listę wszystkich pokoi.
//        2. Pobierz listę wszystkich dostępnych pokoi.
//        3. Rezerwuj pokój (podaj nr pokoju i jeśli jest dostępny to go zarezerwuj).
//            4. Zwolnij pokój (podaj nr pokoju i jeśli jest zajęty to go zwolnij).

}
