package projects.hotel;

import java.util.Random;

//Model danych
public class Room {

    private int nr;
    private int capacity;
    private boolean occupied;
    private boolean withBathroom;

    private static int nextNr = 1; //wszystkie pokoje widzą jedną zmienną nextNr

    public Room() {
        nr = nextNr;
        nextNr++;
        Random random = new Random();
        capacity = random.nextInt(6) + 1;  //1-6
        occupied = random.nextBoolean();
        withBathroom = random.nextBoolean();
    }

    public boolean isOccupied() {
        return occupied;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nr=" + nr +
                ", capacity=" + capacity +
                ", occupied=" + occupied +
                ", withBathroom=" + withBathroom +
                '}';
    }
}
