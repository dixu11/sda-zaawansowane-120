package obiektowe.functionalProgramming.optionalDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GameCatalog {
    private List<Game> games;

    public GameCatalog() {
        games = new ArrayList<>();
        GameDeveloper gameDeveloper = new GameDeveloper("Roman","Project Manager");
        GameDeveloper gameDeveloper2 = new GameDeveloper("Zosia","Junior");
        GameDeveloper gameDeveloper3 = new GameDeveloper("Magda","Mid");
        GameDeveloper gameDeveloper4 = new GameDeveloper("Wojtek","Junior");
        GameDeveloper gameDeveloper5 = new GameDeveloper("Ala","Senior");
        Game game = new Game("Doom",List.of(gameDeveloper,gameDeveloper2));
        Game game2 = new Game("Diablo",List.of(gameDeveloper3));
        Game game3 = new Game("HoMM",List.of(gameDeveloper, gameDeveloper5));
        Game game4 = new Game("Skyrim", List.of(gameDeveloper, gameDeveloper2, gameDeveloper3, gameDeveloper4, gameDeveloper5));
        games.addAll(List.of(game, game2, game3, game4));
    }


    public Optional<Game> findGameByTitle(String title) {
        for (Game game : games) {
            if (game.getTitle().equalsIgnoreCase(title)) {
                return Optional.of(game); // Optional będzie zawierał grę
            }
        }
        return Optional.empty(); // Optional będzie pusty
    }
    //return Optional.ofNullable(mojaZmienna); // jeśli mam zmienną w której może jest może nie

    //znajdź project Managera wybranej gry

    //Znajdź wszystki pracowników określonej rangi
    //Kto pracuje w największej ilości projektów?
    //Ile osób najwięcej pracuje nad projektem?
    //Daj wszystki pracowników, bez powtórek
    //Policz ilość pracowników dla danej rangi
    //ile łącznie osób przedzielono do pracy nad grami (z powtórkami)
    //zwróć wszystkie gry, nad którymi pracuje zespół zawierający minimum jednego seniora


    @Override
    public String toString() {
        return "GameCatalog{" +
                "games=" + games +
                '}';
    }
}
