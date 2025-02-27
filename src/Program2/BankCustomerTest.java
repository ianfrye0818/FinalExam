package Program2;

/**
 * @author Ian Frye
 *         CSC 153 - Java Programming
 *         2/27/25
 *         Final Exam Part 2 - Program 2
 *         Bank Account
 */

public class BankCustomerTest {
  public static void main(String[] args) {
    // Creating BankAccounts for the first customer
    BankAccount checking1 = new BankAccount(101, 1500.0, 1.5);
    BankAccount savings1 = new BankAccount(102, 2500.0, 3.0);
    BankAccount moneyMarket1 = new BankAccount(103, 5000.0, 2.0);

    // Creating the first BankCustomer
    BankCustomer customer1 = new BankCustomer("Alice Johnson", checking1, savings1, moneyMarket1);

    // Creating BankAccounts for the second customer
    BankAccount checking2 = new BankAccount(201, 3000.0, 1.8);
    BankAccount savings2 = new BankAccount(202, 1500.0, 2.5);
    BankAccount moneyMarket2 = new BankAccount(203, 4000.0, 1.2);

    // Creating the second BankCustomer
    BankCustomer customer2 = new BankCustomer("Bob Smith", checking2, savings2, moneyMarket2);

    // Performing deposits
    customer1.getCheckingAccount().deposit(1000.0);
    customer2.getSavingsAccount().deposit(500.0);

    // Print all account information after deposits
    System.out.println("After Deposits:");
    System.out.println(customer1);
    System.out.println(customer2);

    // Display total balances for both customers
    System.out.println("Total Balance for " + customer1.getCustomerName() + ": " + customer1.getTotalBalance());
    System.out.println("Total Balance for " + customer2.getCustomerName() + ": " + customer2.getTotalBalance());
  }
}