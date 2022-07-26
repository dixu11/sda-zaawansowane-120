package obiektowe.collections.sort;

import obiektowe.inheritance.animals.Cow;

import java.util.*;

public class OriginalJavaSort {
    public static void main(String[] args) {
        List<Cow> cows = new LinkedList<>(List.of(
                new Cow("Milka", 3),
                new Cow("Basia", 1),
                new Cow("Mućka", 2),
                new Cow("Ruda", 4)
        ));

        Comparator<Cow> cowComparator = new Comparator<Cow>() {
            @Override
            public int compare(Cow o1, Cow o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        cows.sort(cowComparator);
        System.out.println(cows);

        //LinkedHashSet pamięta kolejność
        LinkedHashSet<String> zwierzeta = new LinkedHashSet<>();
        zwierzeta.add("Krowa");
        zwierzeta.add("Pies");
        zwierzeta.add("Okoń");
        zwierzeta.add("Koń");
        System.out.println(zwierzeta);


        Comparator<String> stringComp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        TreeSet<String> zwierzeta2 = new TreeSet<>(stringComp);
        zwierzeta2.add("Krowa");
        zwierzeta2.add("Pies");
        zwierzeta2.add("Okoń");
        zwierzeta2.add("Koń");
        System.out.println(zwierzeta2);


        //TreeSet domyślnie wykorzystuje natural oreder, czyli domyślny sposób sortowania zdefiniowany
        //przez obiekt sortowany w jego klasie, poprzez zaimplementowanie interfejsu Comparable
        Set<Cow> cowsSet = new TreeSet<>(List.of(
                new Cow("Milka", 3),
                new Cow("Basia", 1),
                new Cow("Mućka", 1),
                new Cow("Ruda", 4)
        ));

        System.out.println(cowsSet);

        List<Cow> cowsList = new ArrayList<>(List.of(
                new Cow("Milka", 3),
                new Cow("Basia", 1),
                new Cow("Mućka", 1),
                new Cow("Ruda", 4)
        ));

        Collections.sort(cowsList);
        System.out.println(cowsList);

    }
}
