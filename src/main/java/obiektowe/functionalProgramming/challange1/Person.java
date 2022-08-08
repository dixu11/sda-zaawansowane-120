package obiektowe.functionalProgramming.challange1;

import java.time.LocalDate;

public abstract class Person {

    private int id;
    private String name;
    private int cash;
    private LocalDate birthDate;

    private static int nextId;

    public Person(String name) {
        id = nextId++;
        this.name = name;
        cash = getRandomCash();
        birthDate = getRandomBirthDate();
    }

    //metoda po zaimplementowaniu ma zwracać liczbę od 0 do 100
    protected abstract int getRandomCash();

    //metoda po zaimplementowaniu ma zwrać aktualną datę cofniętą losową ilość lat: od 0 do 100
    public abstract LocalDate getRandomBirthDate();

    //metoda po zaimplementowaniu ma wyliczać wiek osoby w latach na podstawie jego daty urodzenia
    public abstract int getAge();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cash=" + cash +
                ", birthDate=" + birthDate +
                '}';
    }
}
