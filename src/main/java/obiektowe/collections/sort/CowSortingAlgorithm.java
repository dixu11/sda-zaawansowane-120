package obiektowe.collections.sort;

import obiektowe.inheritance.animals.Cow;

import java.util.LinkedList;
import java.util.List;

public class CowSortingAlgorithm {
    public void sort(List<Cow> numbers) {
        for (int j = 0; j < numbers.size(); j++) {
            for (int i = 0; i < numbers.size() - 1 - j; i++) {
                int first = numbers.get(i);
                int second = numbers.get(i + 1);
                if (first > second) {  //aby zmienić kolejność wystarczy zmienić znak
                    numbers.set(i, second);
                    numbers.set(i + 1, first);
                }
            }
        }
    }
}

class SortingCowsDemo {

    public static void main(String[] args) {
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        List<Cow> cows = new LinkedList<>(List.of(
                new Cow("Basia", 1),
                new Cow("Mućka", 2),
                new Cow("Milka", 3),
                new Cow("Ruda", 4)
        ));
        System.out.println(cows);
        sortingAlgorithm.sort(cows);
        System.out.println(cows);
    }
}
