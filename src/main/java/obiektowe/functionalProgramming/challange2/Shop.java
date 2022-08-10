package obiektowe.functionalProgramming.challange2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

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
    public List<Customer> findCustomersWithOrders() {
        return customers.stream()
                .filter(customer -> customer.hasOrders())
                .toList();
    }


    //zwróć tylko pełnoletnich customerów posortowanych po ich wieku
    public List<Customer> findMatureCustomersSortedByAge() {
        return customers.stream()
                .filter(customer -> customer.getAge()>=18)
                .sorted((c1,c2)-> c1.getAge() - c2.getAge())
                .toList();
    }


    //zwróć zamówienia nie starsze niż tydzień // daty?

    public List<Order> getNewOrders() {
       return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
               //.filter(order -> order.getOrderTime().until(LocalDateTime.now(), ChronoUnit.DAYS) <7)
                .filter(order -> order.getOrderTime().plusDays(7).isAfter(LocalDateTime.now()))
                .toList();
    }


    //zwróć średnią ilość produktów w zamówieniach
    public double findAverageProductAmountOfAllOrders() {
        return getAllProducts()
                .mapToInt(product -> product.getAmount())
                .average()
                .orElse(0);
    }
//zwróć średnią cenę produktów ze wszystkich zamówień
public double findAverageFullProductPriceOfAllOrders() {
    return getAllProducts()
            .mapToDouble(product -> product.getFullPrice())
            .average()
            .orElse(0);
}
    //zwróć customera, który wydał najwięcej
   /* public Customer findTheMostSpendingCustomer(){
        return customers.stream()
                .sorted((c1, c2) -> Double.compare(c2.howMuchSpent(), c1.howMuchSpent()))
                .findFirst()
                .orElseThrow();
    }*/

  /*  public Customer findTheMostSpendingCustomer(){
        return customers.stream()
                .max((c1, c2) -> Double.compare(c2.howMuchSpent(), c1.howMuchSpent()))
                .orElseThrow();
    }*/
  public Customer findTheMostSpendingCustomer(){
      return customers.stream()
              .min(Comparator.comparingDouble(Customer::howMuchSpent))
              .orElseThrow();
  }





//zwróć produkt którego mamy najmniej (wg. amound)
    public Product findProductWithLeastQuantity(){
        return getAllProducts()
                .min((c1, c2) -> c1.getAmount() - c2.getAmount())
                .orElseThrow();
    }

    private Stream<Product> getAllProducts() {
      return customers.stream()
              .flatMap(customer -> customer.getOrders().stream())
              .flatMap(order -> order.getProducts().stream());
    }


    //zwróć wszystkie produkty zamówione później niż tydzień temu
    public List<Product> findLateProducts() {
       return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .filter(order -> order.getOrderTime().minusDays(7).isBefore(LocalDateTime.now()))
                .flatMap(order -> order.getProducts().stream())
                .toList();
    }

//trudne:
//zwróć mapę której kluczem będzie numer miesiąca a wartością ilość customerów urodzonych w danym miesiącu
//zwróć mapę zawierającą kraj oraz ilość produktów pochodzących z tego kraju
}
