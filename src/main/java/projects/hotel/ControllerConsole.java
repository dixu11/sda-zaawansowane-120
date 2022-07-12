package projects.hotel;

import java.util.List;
import java.util.Scanner;

//interfejs aplikacji
//TYLKO TUTAJ SOUT + SCANNER
public class ControllerConsole extends Controller{

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public int askQuestion(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextInt();
    }
}
