package obiektowe.inheritance.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Należy podać liczbę!");
            return readNumber();
        }finally {
            System.out.println("blok finally");
        }
    }


    public static void main(String[] args) {
        Input input = new Input();
        int number = input.readNumber();
        System.out.println("Podano " + number);
    }


}
