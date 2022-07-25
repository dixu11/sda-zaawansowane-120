package obiektowe.collections.restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Dish dish = new Dish("spaghetti",33,DishType.DINNER,500);
        Dish dish2 = new Dish("jajecznica",20,DishType.BREAKFAST,350);
        Dish dish3 = new Dish("pomidorowa",18,DishType.APPETIZER,250);
        restaurant.addDish(dish);
        restaurant.addDish(dish2);
        restaurant.addDish(dish3);
        System.out.println(restaurant);


    }
}
