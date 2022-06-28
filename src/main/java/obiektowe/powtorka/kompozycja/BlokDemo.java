package obiektowe.powtorka.kompozycja;

public class BlokDemo {
    public static void main(String[] args) {



        Mieszkanie mieszkanie1 = new Mieszkanie(4);
        Mieszkanie mieszkanie2 = new Mieszkanie(5);
        Mieszkanie mieszkanie3 = new Mieszkanie(6);

        Mieszkanie[] mieszkania = new Mieszkanie[3];
        mieszkania[0] = mieszkanie1;
        mieszkania[1] = mieszkanie2;
        mieszkania[2] = mieszkanie3;

        Blok blok = new Blok(mieszkania);

        System.out.println(blok);

        SerwisSpoldzielni serwisSpoldzielni = new SerwisSpoldzielni(blok);
        serwisSpoldzielni.oplacCzynsz(4);

        System.out.println(blok);


    }
}
