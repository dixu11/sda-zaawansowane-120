package obiektowe.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functions {
    public static void main(String[] args) {


        Equation addition = new Equation(){
            @Override
            public double evaluate(double number1, double number2) {
                return number1+number2;
            }
        };


        Equation subtraction = (double number1, double number2) ->{
                return number1-number2;
            };

        Equation multiplication = (num1, num2) ->  num1*num2;

        System.out.println(addition.evaluate(10, 20));
        System.out.println(subtraction.evaluate(10,20));
        System.out.println(multiplication.evaluate(10,20));

        //wyrażenie lambda można budować wyłącznie na bazie interfejsów funcyjnych
        //czyli takich, które mają DOKŁADNIE JEDNĄ metodę abstracyjną

        TextManipulator shouter =  text ->  text.toUpperCase()+"!";

        System.out.println(shouter.change("Hello"));
        System.out.println(shouter.change("Co tam?"));

        TextManipulator encoder = text -> {
            String newText = "";
            for (int i = 0; i < text.length(); i++) {
                char letter = (char) (text.charAt(i) + 1);
                newText += letter;
            }
            return newText;
        };

        System.out.println(encoder.change("Cześć, co tam, co słychać?"));

        //Supplier - nic nie bierze coś zwraca
        //Consumer - coś bierze nic nie zwraca
        //Function - coś przyjmie coś zwraca (może być inny typ)
        //Operator - przyjmie to samo co zwraca
        //Predicate - coś przyjmie zwraca boolean
        //Comparator - przyjmie 2 rzeczy zwraca int
        //ActionListener - przyjme event, nic nie zwraca
        //Runnable - nic nie przyjmie, nic nie zwraca


        Thread thread = new Thread( () ->{
            for (int i = 0; i < 1000; i++) {
                System.out.println("Kod na osobnym wątku");
            }
        });

        //thread.start();

        List<String> names = new ArrayList<>();
        names.add("Ania");
        names.add("Ada");
        names.add("Adam");
        names.add("Ara");

        Predicate<Integer> isPositive = number -> number > 0;

        if (isPositive.test(10)) {
            System.out.println("Dodatni");
        }

        names.forEach(name -> System.out.println("Cześć " + name) );
    }




}

interface Equation{
    double evaluate(double number1, double number2);
}

interface TextManipulator{
    String change(String text);
}
