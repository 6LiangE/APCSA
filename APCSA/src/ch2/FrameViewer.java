/**
 * Evan Liang
 * 6
 * Chapter 2 Projects
 * P2.13
 * This program prints a phrase as well as an image.
 */
package ch2;

import java.awt.Color;
import javax.swing.*;

public class FrameViewer extends JComponent {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(400, 400);
        frame.setTitle("P2.13");
        ImageIcon icon = new ImageIcon("/Users/evanywliang/Downloads/wave.jpg");
        JLabel wave = new JLabel(icon);
        JLabel label = new JLabel("Hello, Evan!");
        label.setBounds(20, 20, 400, 400);
        wave.setBounds(35, 0, 400, 400);
        Color lightGreen = new Color(152,251,152);
        panel.setBackground(lightGreen);
        panel.setLayout(null);
        panel.add(label);
        panel.add(wave);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
