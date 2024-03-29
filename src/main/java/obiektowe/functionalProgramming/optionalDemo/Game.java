package obiektowe.functionalProgramming.optionalDemo;

import java.util.List;

public class Game {

    private String title;
    private List<GameDeveloper> gameDevelopers;

    public Game(String title, List<GameDeveloper> gameDevelopers) {
        this.title = title;
        this.gameDevelopers = gameDevelopers;
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
