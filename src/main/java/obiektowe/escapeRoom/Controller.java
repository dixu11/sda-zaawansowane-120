package obiektowe.escapeRoom;

import java.util.List;
import java.util.Scanner;

//interakcja z aplikacją (wyłącznie wydawanie jej poleceń i oglądanie rezultatów)
//jedyna klasa w której będę używał sout + Scanner
public class Controller {

    private Scanner scanner = new Scanner(System.in);
    private Game game = new Game(); //Controller zwraca się do gry aby zlecić różne zadania


    public void start() {
        printMenu();
       int selection = selectOption();
        useSelectedItem(selection);
    }

    private void printMenu() {
        System.out.println("Witamy w grze Escape Room!");
        //przedmioty
        List<Item> items = game.getItems();
        for (int i = 0; i < items.size(); i++) {
            // System.out.println(i+1 + ". " + items.get(i).getName());
            System.out.printf("%d. %s\n", i+1, items.get(i).getName());
        }
    }

    private int selectOption() { //todo zabezpieczyć przed błędami - podawania liter
        System.out.println("Co wybierasz?");
        int selection = scanner.nextInt();
        if (selection < 1 || selection > game.howManyItems()) {
            System.out.println("Wyszedłeś poza zakres przedmiotów!");
            return selectOption();
        }
        return selection;
    }

    private void useSelectedItem(int itemNumber){
        System.out.println("Używasz przedmiotu nr " + itemNumber);
        game.useItem(itemNumber - 1);
    }

}
