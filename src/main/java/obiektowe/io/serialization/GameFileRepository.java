package obiektowe.io.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GameFileRepository {

    public void saveGame(Game game) {
        System.out.println("Zapisuję w pliku!");
        System.out.println(game);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/obiektowe/io/serialization/games.bin"));
            oos.writeObject(game);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}
