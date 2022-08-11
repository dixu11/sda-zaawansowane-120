package obiektowe.io.serializationJson;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Game {

    private String title;
    private List<GameDeveloper> gameDevelopers;

    public Game(String title, List<GameDeveloper> gameDevelopers) {
        this.title = title;
        this.gameDevelopers = gameDevelopers;
    }

    //biblioteka Jackson wykorzystuje (a więc wymaga) bezparametrowego konstruktora
    public Game() {

    }

    public void showTitle() {
        System.out.println(title);
    }

    //gettery do wszystkich pól
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
