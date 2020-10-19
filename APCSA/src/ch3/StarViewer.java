package ch3;

import javax.swing.*;

public class StarViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //Initializes new frame object
        frame.setSize(400, 400); //Sets window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StarComponent component = new StarComponent();
        frame.add(component); //Adds stars
        frame.setVisible(true);
    }
}
