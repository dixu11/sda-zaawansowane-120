package obiektowe.escapeRoom;

public class Mediator { // jako argument metody use jako alternatywa dla przekazywania obiektu Game
    private Player player;
    private Game game;
    private Room room;

    public Mediator(Player player, Game game, Room room) {
        this.player = player;
        this.game = game;
        this.room = room;
    }

    public Player getPlayer() {
        return player;
    }

    public Game getGame() {
        return game;
    }

    public Room getRoom() {
        return room;
    }
}
