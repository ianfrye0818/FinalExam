package Program1;

public class BankAccountTest {
  public static void main(String[] args) {
    // Create objects of BankAccount
    BankAccount account1 = new BankAccount(1001, 500.0, 2.5);
    BankAccount account2 = new BankAccount(1002); // Default balance and rate
    BankAccount account3 = new BankAccount(); // All default values

    // Output initial states
    System.out.println(account1);
    System.out.println(account2);
    System.out.println(account3);

    // Perform some operations
    try {
      account1.deposit(150.0);
      System.out.println("After depositing $150.0: " + account1);

      account1.withdraw(100.0);
      System.out.println("After withdrawing $100.0: " + account1);

      account2.deposit(200.50);
      System.out.println("After depositing $200.50 to account2: " + account2);

      account3.withdraw(50.0); // This will cause an exception
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    // Final output of all accounts
    System.out.println("Final State of all accounts:");
    System.out.println(account1);
    System.out.println(account2);
    System.out.println(account3);
  }
}