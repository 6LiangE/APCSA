/**
 * Evan Liang
 * 6
 * Chapter 2 Projects
 */
package ch2;

import java.awt.*;

public class PerimeterTester {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 5, 10, 20);
        int perimeter = (int) ((2 * box.getWidth()) + (2 * box.getHeight()));
        System.out.println(perimeter);
    }
}
