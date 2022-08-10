package obiektowe.escapeRoom;

import java.util.List;
import java.util.Scanner;

//interakcja z aplikacją (wyłącznie wydawanie jej poleceń i oglądanie rezultatów)
//jedyna klasa w której będę używał sout + Scanner
public class Controller {

    private Scanner scanner = new Scanner(System.in);
    private Game game = new Game(); //Controller zwraca się do gry aby zlecić różne zadania


    public void start() {
        System.out.println("Witamy w grze Escape Room!");
        //przedmioty
        List<Item> items = game.getItems();
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i+1 + ". " + items.get(i).getName());
           // System.out.printf("%d. %s\n", i, items.get(i));
        }
    }
}
