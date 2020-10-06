package ch1;

public class p3 {

    public static void main(String[] args) {
        getpi(1000000);
    }

    public static double getpi(int sequence) {
        int printInterval = 25000;
        float pi = 0F;
        for (int i = 0; i <= sequence; i++) {
            double nextNumber  = nextPi(i);
            if (i % 2 == 0 ) {
//                System.out.printf("%s add Number: %s = ", String.format("%.5f", pi), String.format("%.5f", nextNumber));
                pi += nextNumber;
            } else {
//                System.out.printf("%s subtract Number: %s = ", String.format("%.5f", pi), String.format("%.5f", nextNumber));
                pi -= nextNumber;
            }
//            System.out.printf("%s%n", String.format("%.5f", pi));
            if  (i % printInterval == 0) {
                System.out.printf("Calculated PI at step[%d] : [%s]  vs JAVA PI : [%s] %n", i, String.format("%.15f", pi), Math.PI);
            }
        }
        return pi;
    }

    public static double nextPi(int currentN) {
        double nextPi = 4.0D/((currentN*2) + 1);
        return nextPi;
    }
}
