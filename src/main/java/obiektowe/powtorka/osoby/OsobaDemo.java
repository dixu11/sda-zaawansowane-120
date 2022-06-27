package obiektowe.powtorka.osoby;

import java.util.Random;

public class OsobaDemo {
    public static void main(String[] args) {
        int liczba = 10;
        String tekst = new String("abc");
        Random random = new Random();
        int[] liczby = new int[]{1,2,3,4};

        Osoba osoba1 = new Osoba();
        osoba1.imie = "Radek";
        osoba1.wiek = 30;


        Osoba osoba2 = new Osoba();
        osoba2.imie = "Zofia";
        osoba2.wiek = 25;

       // System.out.println(Osoba.imie);

        System.out.println(osoba1.imie);
        System.out.println(osoba2.imie);

        System.out.println(osoba1);
        System.out.println(osoba2);

        osoba1.przywitajSie();
        osoba2.przywitajSie();

        osoba1.wyprawUrodziny();

        osoba1.przywitajSie();
        osoba2.przywitajSie();
    }
}
