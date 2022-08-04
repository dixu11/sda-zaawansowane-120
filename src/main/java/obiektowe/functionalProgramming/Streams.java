package obiektowe.functionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        Product product1 = new Product("Cukier", 8.99, 1);
        Product product2 = new Product("Mleko", 3, 40);
        Product product3 = new Product("Kocia karma", 6, 15);
        Product product4 = new Product("Papier toaletowy", 10, 20);
        Product product5 = new Product("Mąka", 2.5, 4);


        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        //Wyświetl produkty które kosztują mniej niż 5 zł
        List<Product> odfiltrowane = products.stream()
                .filter(product -> product.getPrice() < 5)
                .collect(Collectors.toList());
        //.forEach( product -> System.out.println(product));


        List<Product> posrtowane = products.stream()
                .sorted((prod1, prod2) -> Double.compare(prod1.getPrice(), prod2.getPrice()))
                .toList();


        System.out.println(odfiltrowane);
        System.out.println(posrtowane);


        products.stream()
                .filter(product -> product.getPrice() < 10)
                .map(product -> product.getAmount())
                .filter(amount -> amount < 10)
                .forEach(amount -> System.out.println(amount));


        System.exit(0);

        products.forEach(product -> System.out.println(product));


        //zliczyć łączną ilość produktów

        // int counter = 0;
        final MyInt myInt = new MyInt();
        myInt.number = 0;
        //nie można używać zmiennych lokalnych w lambdzie chyb że są final
        products.forEach(product -> myInt.number += product.getAmount());

    }




  /*  private static Consumer<Product> prepareLambda(){
        int counter = 0;
        Consumer<Product> myLambda= product->{
            counter += product.getAmount();
        };
        return myLambda;
    }*/


}

class MyInt {
    int number;
}

class Product {

    private String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
