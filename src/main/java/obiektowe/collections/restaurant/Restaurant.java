package obiektowe.collections.restaurant;

import java.util.HashSet;
import java.util.Set;

public class Restaurant {
    private final Set<Dish> dishes = new HashSet<>();

    public void addDish(Dish dish){
        dishes.add(dish);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "dishes=" + dishes +
                '}';
    }
}


/*
    Stwórz obiekt Dish (potrawa), potrawa ma posiadać nazwę, cenę, wartość kaloryczną oraz enum -
     typ (np. BREAKFAST, DINNER, APPETIZER).

        Uwaga, żadna z poniższych metod nie powinna drukować nic w konsoli. Wykorzystaj metody
        toString oraz wartości zwracane lub obsługę wyjątków :)

        stwórz klasę Restaurant, zawierającą zbiór dań
        stwórz metody pozwalającą dodać danie i usunąć
        dodaj do restauracji 5 różnych dań
        zaimplementuj metody equals i hashCode aby uniknąć duplikatów i upewnij się, że spełniają swoje zadanie
        stwórz metodę pozwalającą wyszukać danie po nazwie, ma ona zwracać obiekt typu Dish, w przypadku nie odnalezienia takiego obiektu obiektu ma rzucać wyjątek typu RestaurantException
        stwórz metodę pozwalającą wyszukać dania po typie potrawy, jeśli nie ma żadnej potrawy w danym typie, metoda ma zwracać pustą listę.
*/
