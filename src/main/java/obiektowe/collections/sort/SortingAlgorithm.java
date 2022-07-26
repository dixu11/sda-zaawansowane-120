package obiektowe.collections.sort;

import java.util.LinkedList;
import java.util.List;

public class SortingAlgorithm {


    public void sort(List<Integer> numbers) {
        for (int j = 0; j < numbers.size(); j++) {
            for (int i = 0; i < numbers.size() - 1 - j; i++) {
                int first = numbers.get(i);
                int second = numbers.get(i+1);
                if (first > second) {  //aby zmienić kolejność wystarczy zmienić znak
                    numbers.set(i, second);
                    numbers.set(i + 1, first);
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
