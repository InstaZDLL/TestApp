// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Structure.Panneau;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame cadre = new JFrame("Triangle in Circle");

        Panneau panel = new Panneau();

        cadre.add(panel);
        cadre.setSize(500, 500);
        cadre.setMinimumSize(new Dimension(400, 400));
        cadre.setLocationRelativeTo(null);
        cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadre.setVisible(true);
    }
}
