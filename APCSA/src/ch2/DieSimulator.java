/**
 * Evan Liang
 * 6
 * Chapter 2 Projects
 */
package ch2;

import java.util.Random;

public class DieSimulator {
    public static void main(String[] args) {
        Random die = new Random();
        var dieValue = die.nextInt(7);
        System.out.println(dieValue);
    }
}
