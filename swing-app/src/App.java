import javax.swing.*;

public class App {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Swing App Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a label
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
