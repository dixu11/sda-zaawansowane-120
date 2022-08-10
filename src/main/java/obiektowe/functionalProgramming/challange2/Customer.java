package obiektowe.functionalProgramming.challange2;

import java.time.LocalDate;
import java.util.List;

public class Customer {
    private List<Order> orders;
    private String name;
    private LocalDate birthday;

    public Customer(List<Order> orders, String name, LocalDate birthday) {
        this.orders = orders;
        this.name = name;
        this.birthday = birthday;
    }


    public double howMuchSpent(){
        return orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(product -> product.getFullPrice())
                .sum();
    }


    public int getAge() {
        return birthday.until(LocalDate.now()).getYears();
    }


    public boolean hasOrders() {
        return !orders.isEmpty();
    }

    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }


    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "orders=" + orders +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
