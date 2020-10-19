package ch3;

/**
 * Evan Liang
 * Period 6
 * Chapter 2 Homework E3.14
 * Creates an ellipse based on window size.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ellipseDrawer {
    public static int x;
    public static int y;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            x = frame.getWidth();
            y = frame.getHeight();
            Bug comp = new Bug();
            frame.add(comp);
            frame.setVisible(true);
        }
    }
    public static class Bug extends JComponent{
        public void paintComponent(Graphics g) {
            int height = ellipseDrawer.x;
            int width = ellipseDrawer.y;
            Graphics2D g2 = (Graphics2D) g;
            Color gray = new Color(100,100,100);
            Ellipse2D.Double e = new Ellipse2D.Double(0,0,height,width);
            g2.fill(e);
            g2.setColor(Color.gray);
            Ellipse2D.Double e2 = new Ellipse2D.Double(0+5, 0+5, height - 10, width - 10);
            g2.fill(e2);
        }
    }
}
