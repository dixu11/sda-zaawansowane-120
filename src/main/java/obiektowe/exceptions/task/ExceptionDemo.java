package obiektowe.exceptions.task;

public class ExceptionDemo {
    public static void main(String[] args) {
        FileConnection fileConnection = new FileConnection();
        try {
            fileConnection.connect();
            System.out.println(fileConnection.getBooksFromFile());
        }catch (FileConnectionException e){
            System.out.println("Błąd przy połączeniu");
        }catch (FileDbConnectionException e){
            System.out.println(e.getMessage());
        }finally {
            fileConnection.disconnect();
        }
        System.out.println(fileConnection);
    }



/*
    Przygotuj klasę FileConnection, pozwalającą łączyć się z plikiem i pobierać z niego dane.
    Wywołanie metody connect ma ustawiać stan obiektu na połączony, jednak ma istnieć 25% szans na to że połączenie
    się nie powiedzie i zostanie rzucony Twój własny wyjątek FileConnectionException.
    Stwórz również metodę umożliwiającą pobranie danych z obiektu (jako działanie tej metody wykorzystaj wcześniej
     przygotowane czytanie pliku z książkami) wynik zwracaj jako String lub List<String> . Jeśli brakuje plików lub
      plik tekstowy jest pusty należy również rzucić wyjątek FileDbConnectionException z odpowiednią wiadomością.
    Zaimplementuj również metodę “disconnect” zmieniający stan obiektu na nie połączony. Wywołaj tę metodę w bloku
    finally w main.
*/

}
