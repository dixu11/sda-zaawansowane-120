package obiektowe.powtorka;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaForEachDemo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ada");
        names.add("Ala");
        names.add("Adam");

        //wyświetla imiona z listy z ilością znaków = 3
        for (String name : names) {
            if (name.length() == 3) {
                System.out.println(name);
            }
        }

     /*   names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                if (name.length() == 3) {
                    System.out.println(name);
                }
            }
        });*/

        /*names.forEach(
            (String name) ->{
                if (name.length() == 3) {
                    System.out.println(name);
                }
            });*/

        names.forEach(
                name ->{
                    if (name.length() == 3) {
                        System.out.println(name);
                    }
                });
    }
}
