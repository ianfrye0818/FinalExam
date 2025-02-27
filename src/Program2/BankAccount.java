package Program2;

public class BankAccount {
  private int accountId;
  private double balance;
  private double rate;

  // Full constructor
  public BankAccount(int accountId, double balance, double rate) {
    setAccountId(accountId);
    setBalance(balance);
    setRate(rate);
  }

  // Partial constructor
  public BankAccount(int accountId) {
    this.accountId = accountId;
    this.balance = 0.0;
    this.rate = 0.0;
  }

  // Non-argument constructor
  public BankAccount() {
    this.accountId = 0;
    this.balance = 0.0;
    this.rate = 0.0;
  }

  // Setters and Getters
  public int getAccountId() {
    return accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    if (balance < 0) {
      throw new IllegalArgumentException("Balance cannot be negative.");
    }
    this.balance = balance;
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    if (rate < 0) {
      throw new IllegalArgumentException("Rate cannot be negative.");
    }
    this.rate = rate;
  }

  // Deposit method
  public void deposit(double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("Deposit amount must be positive.");
    }
    this.balance += amount;
  }

  // Withdraw method
  public void withdraw(double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("Withdrawal amount must be positive.");
    }
    if (amount > this.balance) {
      throw new IllegalArgumentException("Insufficient funds for withdrawal.");
    }
    this.balance -= amount;
  }

  // Override toString method for easier output
  @Override
  public String toString() {
    return "BankAccount{" +
        "accountId=" + accountId +
        ", balance=" + balance +
        ", rate=" + rate +
        '}';
  }
}