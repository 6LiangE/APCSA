package ch3;

import java.awt.*;

public class StarComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        star s1 = new star(10, 10);
        star s2 = new star(50, 50);
        star s3 = new star(100, 100);
        s1.draw(g2);
        s2.draw(g2);
        s3.draw(g2);
    }
}
