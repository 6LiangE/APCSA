package ch3;

/**
 * Evan Liang
 * Period 6
 * Chapter 2 Homework P3.6
 * Draws a star
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class star extends JComponent {
    public int x,y;
    public star(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public void draw(Graphics2D g2) {
        Line2D.Double l1 = new Line2D.Double(x,y,x+20,y+20);
        Line2D.Double l2 = new Line2D.Double(x+10,y,x+10,y+20);
        Line2D.Double l3 = new Line2D.Double(x,y + 10,x+20,y+10);
        Line2D.Double l4 = new Line2D.Double(x,y,x+20,y+20);
        Line2D.Double l5 = new Line2D.Double(x,y+20,x+20,y);
        g2.draw(l1);
        g2.draw(l2);
        g2.draw(l3);
        g2.draw(l4);
        g2.draw(l5);
    }
}
