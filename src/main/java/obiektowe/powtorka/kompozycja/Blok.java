package obiektowe.powtorka.kompozycja;

import java.util.Arrays;

public class Blok {
    private Mieszkanie[] mieszkania;

    public Blok(Mieszkanie[] mieszkania) {
        this.mieszkania = mieszkania;
    }

    @Override
    public String toString() {
        return "Blok{" +
                "mieszkania=" + Arrays.toString(mieszkania) +
                '}';
    }
}
