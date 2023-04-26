package Structure;

import java.awt.*;
import javax.swing.*;

public class Panneau extends JPanel implements TriangleInCircleInterface {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw red circle
        g.setColor(Color.RED);
        int circleSize = (int) (3 * Math.min(getWidth(), getHeight()) / 4.0);
        int circleX = getWidth() / 2 - circleSize / 2;
        int circleY = getHeight() / 2 - circleSize / 2;
        g.drawOval(circleX, circleY, circleSize, circleSize);

        // Draw blue triangle
        g.setColor(Color.BLUE);
        int triangleHeight = (int) (Math.sqrt(3) * circleSize / 2);
        int[] xPoints = {getWidth() / 2, getWidth() / 2 - circleSize / 2, getWidth() / 2 + circleSize / 2};
        int[] yPoints = {getHeight() / 2 - triangleHeight / 2, getHeight() / 2 + triangleHeight / 2, getHeight() / 2 + triangleHeight / 2};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
