package obiektowe.classes.calculator;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        MathOperation addition = new MathOperation(){
            @Override
            public int execute(int number1, int number2) {
                return number1 + number2;
            }
        };
        Calculator calculator = new Calculator(addition);
        calculator.calculate();

        MathOperation subtraction = new MathOperation() {
            @Override
            public int execute(int number1, int number2) {
                return number1-number2;
            }
        };
        Calculator calculator2 = new Calculator(subtraction);
        calculator2.calculate();




    }
}



class Calculator{

    private MathOperation mathOperation;

    public Calculator(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void calculate() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę:");
        int number = scanner.nextInt();

        System.out.print("Podaj drugą liczbę:");
        int number2 = scanner.nextInt();

        //wykonuję obliczenie
        int result= mathOperation.execute(number, number2);

        System.out.println("Wynik Twojego obliczenia: " + result);


    }

}

interface MathOperation{
    int execute(int number1, int number2);
}
