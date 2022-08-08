package obiektowe.functionalProgramming.challange1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonDemo {
    //za zadanię można otrzymać 14 punktów w tym po 1 za każdą zaimplementowaną abstrakcyjną metodę

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Marcin", "Zbyszek", "Kasia", "Zosia", "Kasia", "Magda", "Iza"));
        int[] primeNumbers = {2, 79, 83, 41, 43, 47, 53, 59, 13, 17, 83, 31,
                37, 61, 67, 89, 3, 5, 7, 7, 11, 71, 73, 97, 19, 19, 23, 29};

        //primeNumbers.stream
        //Arrays.stream(primeNumbers)

        StreamService streamService = new MyStreamService();

        //miejsce na Twoje testy zaimplementowanych metod. Jeśli umiesz możesz wykonać testy jednostkowe udowadniające
        //poprawne działanie zaimplementowanych metod
        streamService.sortAndPrint(names);

        //List<Person> people = streamService.buildPeopleWithNames(names);
        //od tego momentu wykorzystuj również zbiór people do testu metod wykorzystujących argument List<Person>

    }

}
