package Structure;

import java.awt.*;
import javax.swing.*;

public class Panneau extends JPanel implements Window {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Affichage du cercle rouge
        g.setColor(Color.RED);
        int cercleTaille = (int) (3 * Math.min(getWidth(), getHeight()) / 4.0);
        int triangleHeight = (int) (Math.sqrt(3) * cercleTaille / 2);
        int[] xPoints = {getWidth() / 2, getWidth() / 2 - cercleTaille / 2, getWidth() / 2 + cercleTaille / 2};
        int[] yPoints = {getHeight() / 2 - triangleHeight / 2, getHeight() / 2 + triangleHeight / 2, getHeight() / 2 + triangleHeight / 2};
        int centroidX = (xPoints[0] + xPoints[1] + xPoints[2]) / 3;
        int centroidY = (yPoints[0] + yPoints[1] + yPoints[2]) / 3;
        int cercleX = centroidX - cercleTaille / 2;
        int cercleY = centroidY - cercleTaille / 2;
        g.drawOval(cercleX, cercleY, cercleTaille, cercleTaille);

        // Affichage du triangle bleu
        g.setColor(Color.BLUE);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
