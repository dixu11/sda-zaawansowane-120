package obiektowe.exceptions.task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileConnection {

    private boolean connected = false;

    public void connect()throws FileConnectionException {
        Random random = new Random();
       double randomPercent= random.nextDouble(); // 0.0 / 1.0     ---- 0.2434354343
        if (randomPercent < 0.25) {
            throw new FileConnectionException();
        }
        connected = true;
    }

    public List<String> getBooksFromFile()throws FileDbConnectionException {
        File file = new File("src\\main\\java\\obiektowe\\exceptions\\ksiazki.txt");
        List<String> lines = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

           /*  String line = bufferedReader.readLine();
           while (line!=null){
                lines.add(line);
                line = bufferedReader.readLine();
            }*/
            String line;
            while ( (line = bufferedReader.readLine()) != null ){
                lines.add(line);
            }
            if (lines.isEmpty()) {
                throw new FileDbConnectionException("Plik jest pusty!");
            }

        } catch (IOException e) {
            throw new FileDbConnectionException("Nie znaleziono pliku!");
        }
        return lines;
    }

    @Override
    public String toString() {
        return "FileConnection{" +
                "connected=" + connected +
                '}';
    }

    //    Wywołanie metody connect ma ustawiać stan obiektu na połączony, jednak ma istnieć 25% szans na to że połączenie
//    się nie powiedzie i zostanie rzucony Twój własny wyjątek FileConnectionException.


}
