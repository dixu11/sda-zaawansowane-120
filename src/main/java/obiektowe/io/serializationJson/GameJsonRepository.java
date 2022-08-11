package obiektowe.io.serializationJson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class GameJsonRepository {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Game game = objectMapper.readValue(new File("src/main/java/obiektowe/io/serializationJson/game.json"), Game.class);
        System.out.println(game);

        Game game2 = new Game("Frostpunk", List.of(new GameDeveloper("Ola","Senior"),new GameDeveloper("Radek","Senior")));
        String json = objectMapper.writeValueAsString(game2);
        System.out.println(json);
        objectMapper.writeValue(new File("src/main/java/obiektowe/io/serializationJson/game.json"),game2);
    }


}
