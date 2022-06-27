package obiektowe.powtorka.osoby;

import java.util.Random;

public class Osoba{

     String imie;
    int wiek;


    /*public Osoba(String startoweImie, int startowyWiek){
        imie = startoweImie;
        wiek = startowyWiek;
    }*/

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Osoba(){
        imie = "Jan";
        Random random = new Random();
        wiek = random.nextInt(100) + 1;
    }

    void przywitajSie() {

        System.out.println("Jestem " + imie + " mam " + wiek + " lat");
    }

    void wyprawUrodziny() {
        wiek++;
    }

/*@Override
    public String toString(){
      return   "Jestem " + imie + " mam " + wiek + " lat";
    }*/


    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
