package obiektowe.classes;

import java.util.List;

public class ClassesDemo {
    public static void main(String[] args) {
        Car car = new Car(30);
        Car car2 = new Car(50);
        System.out.println(car);
        car.runCar();
        System.out.println(car);

//        Car.Engine engine = car2.new Engine();
//        engine.run();
//        engine.run();
//        engine.run();
//        System.out.println(car2);
        Car.Engine engine = new Car.Engine();

//        LocalClass localClass = new LocalClass();
       class LocalClass{ // klasa lokalna

        }
        LocalClass localClass = new LocalClass();

        Car fromAnonymousClass = new Car(40){ // klasa anonimowa wykorzystuje nazwę innej klasy i automatycznie ją dziedziczy
            private int size;
            private String name;

            @Override
            public void runCar() {
                super.runCar();
                System.out.println("Brum brum");
            }
        };

        fromAnonymousClass.runCar();
        System.out.println(fromAnonymousClass);
        System.out.println(car.getClass());
        System.out.println(fromAnonymousClass.getClass());

        Driver driver = new Driver(){ //anonimowa klasa może być również oparata o interfejs
            @Override
            public void drive() {
                System.out.println("Jadymy");
            }
        };
        driver.drive();

    }
}


class Car {
    private double fuel;
    private Engine engine = new Engine();

    public Car(double fuel) {
        this.fuel = fuel;
    }

    public void runCar(){
        engine.run();
    }

  static class Engine{ //klasa wewnętrzna, może wykorzystywać prywatne składowe zewnętrznej. Zwykle jest wykorzystywana tylko przez nią
        //klasa wewnętrzna może być statyczna i wtedy jest nieznależna od obiektu zewnętrznej klasy
      //do klas wewnętrznych działają wszystkie modyfikatory dostępu
        public void run(){
          //  fuel--; //statyczna nie mogłbay użyć fuel
            //new Car(); może użyć prywatnego konstruktora
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                '}';
    }
}

class Class3{

}

interface Driver{
    void drive();
}