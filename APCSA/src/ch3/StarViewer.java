package ch3;

import javax.swing.*;

public class StarViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        StarComponent comp = new StarComponent();
        frame.add(comp);

        frame.setVisible(true);
    }
}
