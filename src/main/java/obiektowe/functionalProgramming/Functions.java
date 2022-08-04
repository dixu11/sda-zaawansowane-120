package obiektowe.functionalProgramming;

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


    }




}

interface Equation{
    double evaluate(double number1, double number2);
}
