package obiektowe.functionalProgramming.optionalDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        GameCatalog gameCatalog = new GameCatalog();
        System.out.println(gameCatalog);

        System.out.println(gameCatalog.findGameByTitle("Doom 3"));

        Game found = gameCatalog.findGameByTitle("Doom").orElse(null);
        String title = "Doom 3";
        Game found2 = gameCatalog.findGameByTitle(title)
                .orElse(new Game(title, new ArrayList<>()));

        System.out.println(found2);
        Optional<Game> foundOptional = gameCatalog.findGameByTitle("Civ");
        if (foundOptional.isPresent()) {
            System.out.println("Jest");
        } else {
            System.out.println("Nie ma");
        }

        gameCatalog.findGameByTitle("Diablo")
                .ifPresent(game -> System.out.println(game.getTitle() + " found!"));
        List<String> gameTitles = gameCatalog.findGameByTitle("Doom")
                .map(game -> game.getTitle())
                .stream().toList();
        System.out.println(gameTitles);

        Game gameFound2 = gameCatalog.findGameByTitle("Doom 2").orElseThrow( () -> new RuntimeException("Ojoj"));


    }
}
