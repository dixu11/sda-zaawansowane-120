package obiektowe.io.serialization;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GameCatalog {
    private List<Game> games;
    private GameFileRepository fileRepository = new GameFileRepository();

    public GameCatalog() {
       /* games = new ArrayList<>();
        GameDeveloper gameDeveloper = new GameDeveloper("Roman", "Project Manager");
        GameDeveloper gameDeveloper2 = new GameDeveloper("Zosia", "Junior");
        GameDeveloper gameDeveloper3 = new GameDeveloper("Magda", "Mid");
        GameDeveloper gameDeveloper4 = new GameDeveloper("Wojtek", "Junior");
        GameDeveloper gameDeveloper5 = new GameDeveloper("Ala", "Senior");
        Game game = new Game("Doom", List.of(gameDeveloper, gameDeveloper2));
        Game game2 = new Game("Diablo", List.of(gameDeveloper3, gameDeveloper2, gameDeveloper5));
        Game game3 = new Game("HoMM", List.of(gameDeveloper));
        Game game4 = new Game("Skyrim", List.of(gameDeveloper, gameDeveloper2, gameDeveloper3, gameDeveloper4, gameDeveloper5));
        games.addAll(List.of(game, game2, game3, game4));*/
        //saveAllGames();
        readAllGames();
    }

    private void readAllGames() {
        games = fileRepository.readGame();
    }


    public Optional<Game> findGameByTitle(String title) {
        for (Game game : games) {
            if (game.getTitle().equalsIgnoreCase(title)) {
                return Optional.of(game); // Optional będzie zawierał grę
            }
        }
        return Optional.empty(); // Optional będzie pusty
    }

    public int howManyJobs() {
        return (int) games.stream()
                .flatMap(game -> game.getGameDevelopers().stream())
                .count();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void saveAllGames() {
        fileRepository.saveGames(games);
    }




    @Override
    public String toString() {
        return "GameCatalog{" +
                "games=" + games +
                '}';
    }
}
