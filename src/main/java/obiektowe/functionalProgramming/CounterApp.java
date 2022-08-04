package obiektowe.functionalProgramming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp {
    public static void main(String[] args) {
        //java Swing
        JFrame frame = new JFrame("My App :D");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocation(2000,100);

        JPanel panel = new JPanel(new FlowLayout());

        JButton button = new JButton("Naciśnij!");
        panel.add(button);

        JTextField numberField = new JTextField("0",10);
        panel.add(numberField);

        frame.add(panel);
        frame.pack();

        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Click!!!!");
               int number =Integer.parseInt(numberField.getText()) ;
                number++;
                numberField.setText(number+"");
            }
        };
        button.addActionListener(action);






    }
}
