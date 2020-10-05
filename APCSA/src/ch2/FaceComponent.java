package ch2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class FaceComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int width = FaceViewer.width;
        int length = FaceViewer.length;
        Ellipse2D.Double head = new Ellipse2D.Double(50,75,200,200);
        g2.draw(head);
        head.height = 20;
        head.width = 20;
        head.y = 150;
        head.x = 80;
        g2.setColor(Color.BLACK);
        g2.draw(head);
        g2.fill(head);
        head.x = head.x + 70;
        g2.draw(head);
        g2.fill(head);
        Line2D.Double mouth = new Line2D.Double(80, 210, 170, 210);
        g2.draw(mouth);
    }
}
