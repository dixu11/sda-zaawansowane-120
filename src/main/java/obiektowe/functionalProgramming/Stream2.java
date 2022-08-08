package obiektowe.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Stream2 {


    public static void main(String[] args) {
        //Programowanie funkcyjne -  filozofia i metodyka programowania będąca odmianą programowania deklaratywnego,
        // w której wykorzystuje się to, że funkcje należą do typów pierwszoklasowych.
        //Clojure, M -> przykład języka 100% funkcyjnego
        //W programowaniu czysto funkcyjnym nie ma reprezentacji przechowywanych danych


//        Przygotuj ArrayList z 10 liczbami z przedziału 0-100.
//        za pomocą metody forEach wyświetl wszystkie liczby
//        za pomocą streama posortuj liczby i wyświetl posortowane
//        za pomocą streama odfiltruj liczby nieparzyste i policz ile pozostało elementów funkcją kończącą count()
//        za pomocą streama odfiltruj wszystkie liczby powyżej 50, pozostałe liczby zbierz do nowej listy
//        za pomocą streama posortuj liczby malejąco a następnie pobierz pierwszą z nich metodą findFirst

        List<Integer> numbers = new ArrayList<>(List.of(56, 1, 22, 88, 44, 33, 77, 88, 1, 99));

        numbers.forEach(number -> System.out.println(number));

        System.out.println();

        numbers.stream()
                .sorted()
                .forEach(number -> System.out.println(number));

        System.out.println();

        long result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();

        System.out.println(result);
        System.out.println();

        List<Integer> filtered = numbers.stream()
                .filter(number -> number <= 50) // które zostają?
                .collect(Collectors.toList());
        System.out.println(filtered);
        System.out.println();

       int numberFound = numbers.stream()
                .sorted( (number1,number2) ->  number2 - number1)
                .findFirst()
               .get();

        System.out.println(numberFound);
    }
}
