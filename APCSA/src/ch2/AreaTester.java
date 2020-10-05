/**
 * Evan Liang
 * 6
 * Chapter 2 Projects
 */
package ch2;

import java.awt.*;

public class AreaTester {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 5, 10, 20);
        int Area = (int) (box.getWidth() * box.getHeight());
        System.out.println(Area);
    }
}
