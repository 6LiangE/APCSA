package ch2;

import javax.swing.*;
import java.awt.*;

public class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int length = FourRectanglePrinter.length;
        int width = FourRectanglePrinter.width;
        g2.setColor(Color.RED);
        Rectangle box = new Rectangle(0, 0, width / 2, length / 2);
        g2.fill(box);
        box.translate(width / 2, 0);
        g2.setColor(Color.GREEN);
        g2.fill(box);
        box.translate(0, length / 2);
        g2.setColor(Color.BLUE);
        g2.fill(box);
        box.translate(-width / 2, 0);
        g2.setColor(Color.YELLOW);
        g2.fill(box);
    }
}
