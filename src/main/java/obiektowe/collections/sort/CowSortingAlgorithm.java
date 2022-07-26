package obiektowe.collections.sort;

import obiektowe.inheritance.animals.Cow;

import java.util.LinkedList;
import java.util.List;

public class CowSortingAlgorithm {
    public void sort(List<Cow> numbers, CowComparator cowComparator) {
        for (int j = 0; j < numbers.size(); j++) {
            for (int i = 0; i < numbers.size() - 1 - j; i++) {
                Cow first = numbers.get(i);
                Cow second = numbers.get(i + 1);
                if (   cowComparator.compareCows(first,second) > 0 ) {  //aby zmienić kolejność wystarczy zmienić znak
                    numbers.set(i, second);
                    numbers.set(i + 1, first);
                }
            }
        }
    }

    public int compare(Cow cow1, Cow cow2){
       return cow1.getName().compareTo(cow2.getName());
    }
    public int compare2(Cow cow1, Cow cow2){
        if (cow1.getAge() > cow2.getAge()) {
            return 1;
        } else if (cow1.getAge() < cow2.getAge()) {
            return -1;
        }else{
            return 0;
        }
    }




    //    <<<<< -100    ......-50.........0..........50...............100 >>>>>>>
    //  33, 66
    // 40, 30
    // 35, 35

}

interface CowComparator{
    int compareCows(Cow cow1, Cow cow2);
}


class SortingCowsDemo {

    public static void main(String[] args) {
        CowSortingAlgorithm cowSortingAlgorithm = new CowSortingAlgorithm();
        List<Cow> cows = new LinkedList<>(List.of(
                new Cow("Milka", 3),
                new Cow("Basia", 1),
                new Cow("Mućka", 2),
                new Cow("Ruda", 4)
        ));
        System.out.println(cows);
        cowSortingAlgorithm.sort(cows, new CowComparator(){
            @Override
            public int compareCows(Cow cow1, Cow cow2) {
                return -cow1.getName().compareTo(cow2.getName());
            }
        });

        System.out.println(cows);
    }
}
