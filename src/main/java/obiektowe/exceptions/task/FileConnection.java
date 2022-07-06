package obiektowe.exceptions.task;

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

    @Override
    public String toString() {
        return "FileConnection{" +
                "connected=" + connected +
                '}';
    }

    //    Wywołanie metody connect ma ustawiać stan obiektu na połączony, jednak ma istnieć 25% szans na to że połączenie
//    się nie powiedzie i zostanie rzucony Twój własny wyjątek FileConnectionException.


}
