package obiektowe.inheritance.citizens;

public class CitizenDemo {
    public static void main(String[] args) {
        King king = new King("Jan");
        Peasant peasant = new Peasant("Janusza");
        Soldier soldier = new Soldier("Janina");
        Townsman townsman = new Townsman("Jarek");

        Town town = new Town();
        town.add(king);
        town.add(peasant);
        town.add(soldier);
        town.add(townsman);

        System.out.println(town);
        System.out.println(town.howManyCanVote());
        town.whoCanVote();
    }
}
/*
* Stwórz klasę abstrakcyjną Citizen oraz klasy dziedziczące:
Peasant(Chłop),
Townsman(Mieszczanin),
King(Król),
Soldier(Żołnierz)
Wszystkie klasy posiadają pole imie (przemyśl gdzie powinno się znajdować to pole).
*  Citizen powinien być klasą abstrakcyjną która posiada metodę abstrakcyjną 'canVote'
*  która zwraca true dla townsman'a i soldier'a, ale false dla chłopa i króla.

Stwórz klasę Town która posiada zbiór obiektów typu Citizen. Dodaj do niej kilku citizenów
* (tworząc ich w main). Obiekt klasy Town ma mieć metody:
howManyCanVote -  które zwracają ilość osób które mogą głosować
whoCanVote -  która wypisuje imiona osób które mogą głosować
* */