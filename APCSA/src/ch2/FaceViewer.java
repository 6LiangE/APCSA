/**
 * Evan Liang
 * 6
 * Chapter 2 Projects
 * P2.11
 * This program prints a face.
 */

package ch2;

import javax.swing.*;

public class FaceViewer {
    public static int width = 500;
    public static int length = 500;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(width, length);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FaceComponent component = new FaceComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
