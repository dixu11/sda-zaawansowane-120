package obiektowe.escapeRoom;

public class Window extends Item{

    private boolean open; // = false

    public Window() {
        super("Window");
    }

    @Override
    public String use() {
        if(open){
            open = false;
           return "Zamykasz okno";
        }else {
            open = true;
            return "Otwierasz okno";
        }
    }
}
