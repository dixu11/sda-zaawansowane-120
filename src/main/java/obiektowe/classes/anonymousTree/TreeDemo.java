package obiektowe.classes.anonymousTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeDemo {

    public static void main(String[] args) {


        List<Tree> forest = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Tree tree = new Tree();
            forest.add(tree);
        }

        Tree magicTree = new Tree(){
            @Override
            public void display() {
                System.out.println("Magiczne drzewo!");
            }
        };

        forest.add(magicTree);
        Collections.shuffle(forest);

        for (Tree tree : forest) {
            tree.display();
        }

    }


}

class Tree{

    public void display() {
        System.out.println("zwykłe drzewo");
    }

}





//    Stwórz obiekt Tree z metodą display() metoda ta ma drukować “zwykłe drzewo”. Stwórz listę 100 drzew i nazwij ją forest.
//    Do zbioru, za pomocą anonimowej klasy, dodaj jedno specjalne drzewo, które będzie wyświetlać “Magiczne drzewo!”.
//    Dodaj je do zbioru a zbiór wmieszaj metodą Collections.shuffle(List). Przeiteruj się po “lesie” i wyświetl wszystkie drzewa
//    za pomocą metody display() :) Jedno z nich powinno wykazać szczególne zachowanie, znajdź je.

