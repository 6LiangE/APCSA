package ch3;

public class Homework {
    public static void test() {
        BankAccount bob = new BankAccount();
        for (int i = 0; i < 11; i++) {
            bob.deposit(i);
        }
        bob.deductMonthlyCharge();
        for (int i = 0l i < 12; i++) {
            bob.withdraw(i);
        }

        public static void main(String[] args) {
            BankAccount bob = new BankAccount();

        }
    }
}
