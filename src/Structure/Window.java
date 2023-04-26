package Structure;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Window {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Triangle in Circle");

        Panneau panel = new Panneau();

        frame.add(panel);
        frame.setSize(500, 500);
        frame.setMinimumSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

