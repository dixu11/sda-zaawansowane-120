package obiektowe.collections.restaurant;

public class Dish {
    private String name;
    private double price; //BigDecimal
    private DishType type;
    private int caloricValue;

    public Dish(String name, double price, DishType type, int caloricValue) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.caloricValue = caloricValue;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", caloricValue=" + caloricValue +
                '}';
    }
}
