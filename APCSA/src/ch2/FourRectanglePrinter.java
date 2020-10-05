/**
 * Evan Liang
 * 6
 * Chapter 2 Projects
 * P2.1
 * This program draws four rectangles by translating one rectangle 3 times and changing the color.
 */

package ch2;

import javax.swing.*;

public class FourRectanglePrinter extends JComponent{
    public static int width = 300;
    public static int length = 400;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(width, length);
        frame.setTitle("P2.1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RectangleComponent component = new RectangleComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
