/**
 * Evan Liang
 * 6
 * Chapter 2 Projects
 */
package ch2;

public class HollePrinter {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String str1 = "Hello World!";
        String str2 = str1.replace("e", "a");
        String str3 = str2.replace("o", "e");
        String str4 = str3.replace("a", "o");
        System.out.println(str4);
    }
}
