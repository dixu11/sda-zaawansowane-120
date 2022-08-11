package obiektowe.escapeRoom;

public class Window extends Item{

    private boolean open; // = false

    public Window() {
        super("Okno");
    }

    @Override
    public String use(GameInteractions gameInteractions) {
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