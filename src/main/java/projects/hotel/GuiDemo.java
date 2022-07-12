package projects.hotel;

import javax.swing.*;

public class GuiDemo {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Jak się nazywasz?");
        JOptionPane.showMessageDialog(null,"Hello "+ name +" !");
    }
}
