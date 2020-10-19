package ch3;

/**
 * Evan Liang
 * Period 6
 * Chapter 2 Homework E3.12
 * Models a bug moving horizontally
 */

public class Bug {
    private int position;
    private int direction = 1;
    public Bug(int initialPosition) {
        position = initialPosition;
    }
    public void turn() {
        direction = direction * -1;
    }
    public void move() {
        position = position + direction;
    }
    public int getPosition() {
        return position;
    }
}
