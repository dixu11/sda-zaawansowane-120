package obiektowe.escapeRoom;

//uruchomienie programiu (i przygotowanie potrzebnych do tego obiektów)
public class Launcher {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
    }
}


//więcej pokoi -
// przejście przez drzwi przenosi do innego pomieszczenia z którego można potem wrócić.
// Pokoje mogą mieć inne przedmioty, inne zagadki i może ich być wiele

//Więcej przedmiotów - są inne przedmioty działające na zasadzie - wybieram i używam. Pozwalają zrobić ciekawsze zagadki
// kraty, wajchy pułapki, szuflady, lustra, inne rodzaje kluczy

//Inna interakcja z aplikacją - alternatywny tryb działania aplikacji - w okienku

//zapis stanu gry - w pliku

//Rozbudowane interakcje - po użyciu przedmiotu można wpisać hasło i przedmiot inaczej zareaguje na poprawne hasło


//    int wiek = 40;
//    String imie = "Adam";
//        System.out.println("Jestem " + imie + " mam " + wiek + " lat");
//                System.out.printf("Jestem %s mam %d lat\n",imie,wiek);
////%f -> liczby dziesiętne
////%.2f do 2 miejsc po przecinku