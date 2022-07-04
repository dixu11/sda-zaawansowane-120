package obiektowe.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Marcin";
        names[1] = "Julia";
        names[2] = "Ada";

        List<String> namesList = new ArrayList<>();
        System.out.println(namesList);
        System.out.println(namesList.size());
        namesList.add("Marcin");
        namesList.add("Julia");
        namesList.add("Ada");
        namesList.add("Grzegorz");

        System.out.println(namesList);
        System.out.println(namesList.size());

        namesList.add(0, "Grzegorz");
        System.out.println(namesList);

        String element = namesList.get(0);
        System.out.println(element);
        namesList.set(1, "Zofia");
        System.out.println(namesList);

//        namesList.remove(0);
        namesList.remove("Grzegorz"); //usunie jedno wystąpienie Stringa
        System.out.println(namesList);


        //immutable - wywołanie toUpperCase tworzy nowego Stringa
        String text = "abc";
       // text.toUpperCase();
        text = text.toUpperCase();
        System.out.println(text);

        //int = Integer
        //char = Character
        //double = Double

        Integer myInt = 10;

        ArrayList<Integer> numbers = new ArrayList<>(); //brak parametryzacji powoduje że mamy liste typu Object
//        numbers.add("abbc");
        numbers.add(10);
        numbers.add(15);
        numbers.add(30);
        numbers.add(232);
        numbers.add(15);
        numbers.add(1);

        Integer element2 = /*(Integer)*/ numbers.get(0);
        System.out.println(element2);
        System.out.println(numbers);

      //  numbers.remove(232); // nie zadziała! bo nie ma takiego indexu - błąd

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println(numbers.contains(15));
        //kopiowanie listy
        ArrayList<Integer> clone = (ArrayList<Integer>) numbers.clone();
        ArrayList<Integer> clone2 =new ArrayList<>(numbers);
        clone.clear();
        System.out.println(clone);
        System.out.println(numbers);


      List<String> names2 = new ArrayList<>( List.of("Ada", "Ania", "Marta", "Marek")   )  ;
        names2.add("Daniel");
        System.out.println(names2);


    }
}
