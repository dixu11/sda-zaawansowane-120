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
        int sum = streamService.distinctAndSumNumbers(primeNumbers);
        System.out.println(sum);
        List<String> namesFiltered = streamService.computeFemaleNames(names);
        System.out.println(namesFiltered);
        streamService.printNumbersOfRange(primeNumbers,7,14);
        List<Integer> namesLength = streamService.computeNamesLength(names);
        System.out.println(namesLength);

        /*List<Person> people2 = new ArrayList<>();
        Person person = new MyPerson();
        people2.add(person);*/

        Person person = new PersonImpl("Michał");
        System.out.println(person);
        System.out.println(person.getAge());
        System.out.println();
        List<Person> people = streamService.buildPeopleWithNames(names);
        System.out.println(people);
        System.out.println();
        System.out.println(streamService.findPeopleOfIdGreaterThan(people,3));
        System.out.println();
        System.out.println(streamService.hasSenior(people));
        System.out.println();
        System.out.println(streamService.sumTotalCash(people));
        System.out.println();
//        people.clear();//nie działa bo toList dało nam Immutable listę - niezmienialną
      //  people = new ArrayList<>();
        System.out.println(streamService.findRichestPerson(people));
        //od tego momentu wykorzystuj również zbiór people do testu metod wykorzystujących argument List<Person>
        System.out.println();
        System.out.println(streamService.computeAverageAge(people));
    }

}
