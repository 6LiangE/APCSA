/**
 * Evan Liang
 * 6
 * Chapter 2 Projects
 */
package ch2;

public class HollePrinter {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        var str1 = "Hello World!";
        var str2 = str1.replace("e", "a");
        var str3 = str2.replace("o", "e");
        var str4 = str3.replace("a", "o");
        System.out.println(str4);
    }
}
