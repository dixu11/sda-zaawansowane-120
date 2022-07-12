package projects.hotel;

import javax.swing.*;


public class ControllerGui extends Controller {

    @Override
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null,message);
    }

    @Override
    public int askQuestion(String question) {
        String stringAnswer = JOptionPane.showInputDialog(question);
        return Integer.parseInt(stringAnswer);
    }
}
