package obiektowe.escapeRoom;

public class Window extends Item{

    private boolean open; // = false

    public Window() {
        super("Window");
    }

    @Override
    public String use(Room room, Player player) { //todo, czy da się stąd wywalić?
        open = !open;
        return open ? "Otwierasz okno" : "Zamykasz okno";
    }
}





//       int liczba = 10;
//        liczba = -liczba;


// if(open){
//        open = false;
//        return "Zamykasz okno";
//        }else {
//        open = true;
//        return "Otwierasz okno";
//        }