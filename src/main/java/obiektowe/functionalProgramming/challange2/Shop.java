package obiektowe.functionalProgramming.challange2;

import java.time.LocalDateTime;
import java.util.List;

public class Shop {
    private List<Customer> customers;

    public Shop(List<Customer> customers) {
        this.customers = customers;
    }

    //zwróć imiona customerów posortowane alfabetycznie
    public List<String> getCustomerNames() {
       return customers.stream()
                .map(customer -> customer.getName())
                .sorted()
                .toList();
    }
//zwróć średni wiek customerów

    public double getAverageAge() {
       return customers.stream()
                .mapToInt(customer -> customer.getAge())
                .average()
                .orElse(-1);

    }

//zwróć customerów którzy mają jakieś zamówienia
//zwróć tylko pełnoletnich customerów posortowanych po ich wieku

    public List<Order> getNewOrders() {
       return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .filter(order -> order.getOrderTime().plusDays(7).isAfter(LocalDateTime.now()))
                .toList();

    }


    //zwróć zamówienia nie starsze niż tydzień // daty?
//zwróć średnią ilość produktów w zamówieniach
//zwróć średnią cenę produktów ze wszystkich zamówień
    //zwróć customera, który wydał najwięcej

   /* public Customer findCustomerThatSpendTheMost() {
        return customers.stream();
    }

    public double howMuchSpent(Customer customer){
        customer.getOrders().stream()
                .flatMap(order-> order.get)
    }*/



//zwróć produkt którego mamy najmniej (wg. amound)
//zwróć wszystkie produkty zamówione później niż tydzień temu

//trudne:
//zwróć mapę której kluczem będzie numer miesiąca a wartością ilość customerów urodzonych w danym miesiącu
//zwróć mapę zawierającą kraj oraz ilość produktów pochodzących z tego kraju
}
