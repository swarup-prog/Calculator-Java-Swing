// Import Necessary Packages
import javax.swing.*;
import java.awt.*;

public class Calculator {
    //========================== Components =============================
    private JFrame frame;
    private JPanel panel;

    public Calculator() {
        // Initialize the JFrame
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setResizable(false);
        frame.setVisible(true);
        
        // Initialize the JPanel
        panel = new JPanel();
        panel.setSize(300, 300);
        panel.setLayout(null);
        frame.add(panel);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
