import javax.swing.*;
import java.awt.Graphics2D;

public class App {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Swing App Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a label
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER) { 
            @Override
            public void paintComponent(java.awt.Graphics g) {
                g.setFont(g.getFont().deriveFont(20f)); // Set font size
                super.paintComponent(g);
            }
        };
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
