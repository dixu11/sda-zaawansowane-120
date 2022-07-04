package obiektowe.collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Marcin";
        names[1] = "Julia";
        names[2] = "Ada";

        ArrayList<String> namesList = new ArrayList<>();
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
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);


    }
}
