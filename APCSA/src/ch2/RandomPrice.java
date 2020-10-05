/**
 * Evan Liang
 * 6
 * Chapter 2 Projects
 */
package ch2;

import java.util.Random;

public class RandomPrice {
    public static void main(String[] arg) {
        Random price = new Random();
        double finalPrice = price.nextInt((int) 10.95);
        System.out.println(finalPrice + 10.00);
    }
}
