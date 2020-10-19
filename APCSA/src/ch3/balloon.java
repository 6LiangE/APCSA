package ch3;

/**
 * Evan Liang
 * Period 6
 * Chapter 2 Homework P3.3
 * Find the volume of a balloon given radius.
 */

public class balloon {
    private double radius;
    public balloon() {
        double radius = 0.0;
    } //initializes the balloon radius
    public void inflate(double amount) {
        this.radius += amount;
    } //adds to the radius
    public double getVolume() {
        return (3*Math.PI*(radius*radius*radius))/4;
    } //find the volume of the radius
    public static void main(String[] args) {
        balloon b1 = new balloon();
        b1.inflate(1.0);
        System.out.println(b1.getVolume());
    }
}
