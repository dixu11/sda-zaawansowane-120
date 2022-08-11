package obiektowe.io.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GameFileRepository {

    private static final String PATH = "src/main/java/obiektowe/io/serialization/games.bin";

    public void saveGames(List<Game> games) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH));
            oos.writeObject(games);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Game> readGame() {
        System.out.println("Odczytuję grę z pliku");
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH));
            List<Game> games= (List<Game>) ois.readObject();
            ois.close();
            return games;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }


}
