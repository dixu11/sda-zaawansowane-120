package obiektowe.escapeRoom;

public class Door extends Item{
    private Key key;
    public Door(Key key) {
        super("Drzwi");
        this.key = key;
    }

    @Override
    public String use(GameInteractions gameInteractions) {
        if (gameInteractions.hasPlayerGotItem(key)) {
            gameInteractions.endGame();
            return"Otwierasz drzwi!";
        }
        return"Drzwi są zamknięte, znajdź klucz";
    }
}
