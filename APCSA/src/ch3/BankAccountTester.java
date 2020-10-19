package ch3;

/**
   A class to test the BankAccount class.
*/
public class BankAccountTester
{
   /**
    * Test class for BankAccount
    * @return amount amount deducted
    */
   public static void test() {
      BankAccount Sean = new BankAccount();
      for (int i=0; i < 11; i++) {
         Sean.deposit(1);
      }
      Sean.monthlyDeduction();
   }

   /**
    Tests the methods of the BankAccount class.
    @param args not used
    */
   public static void main(String[] args) {
      BankAccount Sean = new BankAccount();
      for (int i = 0; i < 11; i++) {
         Sean.deposit(1);
      }
      System.out.println(Sean.serviceFee);
      Sean.monthlyDeduction();
      test();
   }
}
