package obiektowe.powtorka.house;

public class Bed {

    private int cleanLinen;

    public Bed(int cleanLinen){
        this.cleanLinen = cleanLinen;
    }

    public void clean() {
        cleanLinen = 0;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "cleanLinen=" + cleanLinen +
                '}';
    }
}
