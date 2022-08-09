package obiektowe.functionalProgramming.challange1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamService implements StreamService {

    @Override
    public void sortAndPrint(List<String> names) {
        names.stream()
                .sorted()
                .forEach( name -> System.out.println(name));
    }

    @Override
    public int distinctAndSumNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .distinct()
                .sum();
    }

    @Override
    public List<String> computeFemaleNames(List<String> names) {
        return names.stream()
                .filter(name -> name.endsWith("a"))
                .collect(Collectors.toList());
    }

    @Override
    public void printNumbersOfRange(int[] numbers, int minValue, int maxValue) {
        Arrays.stream(numbers)
                .filter(number -> number >= minValue && number <= maxValue)
                .forEach(number -> System.out.println(number));
    }

    @Override
    public List<Integer> computeNamesLength(List<String> names) {
        return names.stream()
                .map(name -> name.length())
                .toList();
    }

    @Override
    //List<? extends Person>
    public List<Person> buildPeopleWithNames(List<String> names) {
        return  names.stream()
                .map(name -> (Person)new PersonImpl(name))
                .toList();
    }
    // List<Person>
    // Stream<PersonImpl> -> to nie wejdzie w <Person> chyba że użyjemy <Person> lub, zmienimy wymóg na List<? exstends Person>

    @Override
    public List<Person> findPeopleOfIdGreaterThan(List<Person> people, int id) {
        return people.stream()
                .filter( person-> person.getId()>id)
                .toList();
    }

    @Override
    public boolean hasSenior(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge()<60)
                .count() > 0;
    }


    public boolean hasSenior2(List<Person> people) {
        List<Person> seniors = people.stream()
                .filter(person -> person.getAge()<60)
                 .toList();
      /*  if (!seniors.isEmpty()) {
            return true;
        } else {
            return false;
        }*/
        return !seniors.isEmpty();
    }

    public boolean hasSenior3(List<Person> people) {
       return people.stream()
                .anyMatch(person -> person.getAge() > 60);
    }

    @Override
    public double sumTotalCash(List<Person> people) {
        return 0;
    }

    @Override
    public Person findRichestPerson(List<Person> people) {
        return null;
    }

    @Override
    public double computeAverageAge(List<Person> people) {
        return 0;
    }
}
