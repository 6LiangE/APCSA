package ch3;

/**
 * A bank account has a balance that can be changed by
 * deposits and withdrawals.
 */
public class BankAccount {
    private double balance;
    public int serviceFee;
    int freeTransactions = 10;

    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     *
     * @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance = balance + amount;
        serviceFee ++;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance = balance - amount;
        serviceFee ++;
    }

    /**
     * Gets the current balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deducts the amount of money charged that month.
     *
     * @return the amount deducted
     */
    public void monthlyDeduction() {
        if (Math.max(serviceFee, freeTransactions)> 10) {
            System.out.print("Service fee: $");
            System.out.println(serviceFee);
        }
        this.serviceFee=0;
    }
}
