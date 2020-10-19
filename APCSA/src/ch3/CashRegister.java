package ch3;

/**
 * Evan Liang
 * Period 6
 * Chapter 2 Homework P3.1
 * Counts purchased items
 */

public class CashRegister {
    private double purchase;
    private double payment;
    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    public double getItemCount() {
        return purchase;
    }
}
