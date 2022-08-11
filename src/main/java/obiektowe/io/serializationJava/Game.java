package obiektowe.io.serializationJava;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Game implements Serializable {

    private String title;
    private List<GameDeveloper> gameDevelopers;
  public final static long serialVersionUID = 7653231502619836973L; //ręczne przejęcie kontroli nad numerem seryjnym klasy (zgodność wersji)
    private transient Scanner scanner = new Scanner(System.in); //transient - przy serializacji oznacza pominięcie

    public Game(String title, List<GameDeveloper> gameDevelopers) {
        this.title = title;
        this.gameDevelopers = gameDevelopers;
    }

    public void showTitle() {
        System.out.println(title);
    }
    public String getTitle() {
        return title;
    }

    public List<GameDeveloper> getGameDevelopers() {
        return gameDevelopers;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", gameDevelopers=" + gameDevelopers +
                '}';
    }
}
