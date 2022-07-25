package obiektowe.collections;

import obiektowe.inheritance.animals.Cow;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //sety nie przechowują powtórek elementów
        //kolejność w HashSet jest przypadkowa/nieoczywista -> nie można na niej polegać ani wykorzystywać
        Set<String> zwierzeta = new HashSet<>();
        zwierzeta.add("Krowa");
        zwierzeta.add("Pies");
        zwierzeta.add("Koń");
        zwierzeta.add("Okoń");
        zwierzeta.add("Koń");

        System.out.println(zwierzeta);

        //zwierzeta.get(0) - nie dziala

        for (String zwierze : zwierzeta) {
            System.out.println(zwierze);
        }

        System.out.println(zwierzeta.contains("Pies"));

        Object object = new Object();
        System.out.println(object.toString());
        System.out.println(Integer.toHexString(123));
        //hash to jest liczbowa reprezentacja obiektu - hashe możliwie równomiernie wykorzystują zakres int
        //hash dwóch różnych obiektów mogą się powtarzać
        // są często wyrażane w systemie heksadecymalnym (16)

        Cow cow1 = new Cow("Matylda", 5);
        Cow cow2 = new Cow("Matylda", 5);
        Cow cow3 = cow1;

        //HashSet wykorzystuje metody equal + hashCode
        Set<Cow> cows = new HashSet<>();
        cows.add(new Cow("Basia", 1));
        cows.add(new Cow("Mućka", 2));
        cows.add(new Cow("Milka", 3));
        cows.add(new Cow("Ruda", 4));
        cows.add(cow1);
        cows.add(cow3);
        System.out.println(cows);


        System.out.println(cow1.hashCode());
        System.out.println(cow2.hashCode());

        //domyślnie equals wykorzystuje ==
        System.out.println(cow1.equals(cow2));  //false lub true po wygenerowaniu equals
        System.out.println(cow1.equals(cow3));  //true

        //porównanie przez referencje - adres obiektu
        System.out.println(cow1 == cow2); //false //INNE obiekty
        System.out.println(cow1 == cow3); //true - te same obiekty fizycznie w pamięci


//        Book book = new Book("Harry Potter");
//        Library library = new Library();
//        library.saveInFile(book);  //zapisze mi w pliku dane z obiektu
//        Book book2 = library.getBookFromFile(); //stworzy nowy obiekt i wstawi mu przez konstruktor dane z tego pliku
//        System.out.println(book.equals(book2));
        //na dłuższą metę będziemy MUSIELI często robić nowe obiekty żeby przechowywać te same dane
        //nie powinniśmy polegać na tym że mamy do czynienia z DOKŁADNIE TYM SAMYM obiektem tylko
        //zwracać uwagę na jego dane czyli np. login, pesel, id i inne unikatowe cechy.


        Set<Cow> cows2 = new HashSet<>();

        for (int i = 0; i < 100_000; i++) {
            Cow randomCow = new Cow(String.valueOf((char) i), i);
            cows2.add(randomCow);
        }
        long startTime = System.currentTimeMillis();
        for (Cow cow : cows2) {
            cow.hashCode();
        }
        long stopTime = System.currentTimeMillis();

        long startTime2 = System.currentTimeMillis();
        for (Cow cow : cows2) {
            cow.equals(cow1);
        }
        long stopTime2 = System.currentTimeMillis();

        //czas który minął w pierwszej pętli
        System.out.println(stopTime-startTime);
        //czas który minął w drugiej pętli
        System.out.println(stopTime2-startTime2);



        //w naszym teście wyszło że metoda hashCode była wolniejsza
        //jednak przy większej kompozycji zagnieżdżonych obiektów i wielu cechach to equals powinien okazać się wolniejszy (do sprawdzenia)
        //HashSet jest zoptymalizowany na to żeby jak najrzadziej wykonywać equals i głównie wykorzystywać hashCode



    }
}
