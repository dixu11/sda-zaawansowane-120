package projects.hotel;

public class Launcher {

    public static void main(String[] args) {
//        Room room1 = new Room();
//        Room room2 = new Room();
//        System.out.println(room1);
//        System.out.println(room2);

        Controller controller = new Controller();
        controller.startMenu();
    }
}

/*
* Elementy każdej aplikacji
* klasa startowa - Launcher
* klasa interfejsu aplikacji (uzytkownik wydaje aplikacji polecenia a ona prezentuje rezultaty)
* model danych (np. Room)
* logika biznesowa (polityka udzielania kredytów, kiedy wygra w szachach itp)
* trwałe przechowywanie danych
* dostęp do danych
* */



  /*  Dodaj klasę Room reprezentującą pojedynczy pokój (nr pokoju, ilu osobowy, czy w pokoju jest
        łazienka - true/false oraz czy pokój jest dostępny - true/false).
        5. Dodaj klasę Hotel która będzie zawierała listę pokoi.
        6. W konstruktorze klasy Hotel utwórz kilka obiektów klasy Room i dodaj je do listy (np. 10-15),
        dzięki temu podczas tworzenia instancji obiektu hotel, automatycznie generowana będzie lista
        pokoi.
        7. Dodaj klasę UserService która będzie służyć do obsługi hotelu. Na początek dodaj
        funkcjonalności:
        1. Pobierz listę wszystkich pokoi.
        2. Pobierz listę wszystkich dostępnych pokoi.
        3. Rezerwuj pokój (podaj nr pokoju i jeśli jest dostępny to go zarezerwuj).
        4. Zwolnij pokój (podaj nr pokoju i jeśli jest zajęty to go zwolnij).
        8. W klasie main utwórz proste menu do obsługi hotelu, przykłady implementacji (prosta pętla
        do...while + switch):
        1. https://stackoverflow.com/a/13536215/5877109
        2. http://chronicles.blog.ryanrampersad.com/2011/03/text-based-menu-in-java/
        9. Do menu dodaj funkcję:
        1. Wyświetl listę pokoi wraz z ich statusem (wolny-zajęty) korzystając z HotelService.
        2. Wyświetl listę tylko dostępnych pokoi.
        3. Zarezerwuj pokój.
        4. Zwolnij pokój*/