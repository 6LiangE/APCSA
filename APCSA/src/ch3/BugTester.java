package ch3;

/**
 * Evan Liang
 * Period 6
 * Chapter 2 Homework E3.12
 * Tests the Bug Class methods.
 */

public class BugTester {
    public static void main(String[] args)
    {
        Bug bugsy = new Bug(10);
        System.out.println("initial position: " + bugsy.getPosition());
        bugsy.move();
        System.out.println("position after moving: " + bugsy.getPosition());
        bugsy.turn();
        bugsy.move();
        System.out.println("position after turning back and moving: " + bugsy.getPosition());
    }}
