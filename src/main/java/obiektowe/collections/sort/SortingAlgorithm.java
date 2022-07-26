package obiektowe.collections.sort;

import obiektowe.inheritance.animals.Cow;

import java.util.LinkedList;
import java.util.List;

public class SortingAlgorithm {


    public void sort(List<Cow> cows) {
        for (int j = 0; j < cows.size(); j++) {
            for (int i = 0; i < cows.size() - 1 - j; i++) {
                int first = cows.get(i);
                int second = cows.get(i+1);
                if (first > second) {  //aby zmienić kolejność wystarczy zmienić znak
                    cows.set(i, second);
                    cows.set(i + 1, first);
                }
            }
        }
    }
}

class SortingDemo {

    public static void main(String[] args) {
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        List<Integer> numbers = new LinkedList<>(List.of(12, 34, 9, 55, 44, 1, 7, 99, 2, 44)); //10 liczb
        System.out.println(numbers);
        sortingAlgorithm.sort(numbers);
        System.out.println(numbers);


    }

}
