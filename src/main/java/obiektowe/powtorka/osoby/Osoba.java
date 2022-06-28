package obiektowe.powtorka.osoby;

import java.util.Random;

public class Osoba{

   private   String imie;
   private int wiek;


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

    String getImie() {
        return imie;
    }


/*@Override
    public String toString(){
      return   "Jestem " + imie + " mam " + wiek + " lat";
    }*/


    public void setWiek(int wiek){
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
