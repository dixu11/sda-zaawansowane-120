package obiektowe.powtorka.kompozycja;

public class Mieszkanie {

    private boolean oplacono;
    private final int numer;

    public Mieszkanie(int numer) {
        this.numer = numer;
    }

    public void oplac() {
        oplacono = true;
    }

    public int getNumer() {
        return numer;
    }
    @Override
    public String toString() {
        return "Mieszkanie{" +
                "oplacono=" + oplacono +
                ", numer=" + numer +
                '}';
    }
}
