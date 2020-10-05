/**
 * Evan Liang
 * 6
 * Chapter 2 Projects
 * P2.5
 * This program prints 6 random numbers between 1 and 49.
 */

package ch2;

import java.util.Random;

public class LotteryPrinter {
    public static void main(String[] args) {
        Random dice = new Random();
        System.out.print("Play this combination: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(dice.nextInt(50)-1+" ");
        }
        System.out.println(" It will make you rich!");
    }
}
