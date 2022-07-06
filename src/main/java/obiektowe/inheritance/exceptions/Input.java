package obiektowe.inheritance.exceptions;

import java.util.Scanner;

public class Input {

    public int readNumber(){
        Scanner scanner = new Scanner(System.in);

        return 0;
    }


    public static void main(String[] args) {
        Input input = new Input();
        int number = input.readNumber();
        System.out.println("Podano " + number);
    }



}
