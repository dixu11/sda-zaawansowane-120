package obiektowe.powtorka.kompozycja;

import java.util.Arrays;

public class Blok {
    private Mieszkanie[] mieszkania;

    public Blok(Mieszkanie[] mieszkania) {
        this.mieszkania = mieszkania;
    }

    public Mieszkanie znajdzMieszkanie(int numerMieszkania){
        for(Mieszkanie mieszkanie : mieszkania){
            if (mieszkanie.getNumer() == numerMieszkania) {
                return  mieszkanie;
            }
        }
        return  null; //todo refactor!
    }

    @Override
    public String toString() {
        return "Blok{" +
                "mieszkania=" + Arrays.toString(mieszkania) +
                '}';
    }
}
