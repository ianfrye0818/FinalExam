package Program2;

/**
 * Represents a bank account with basic banking operations.
 * This class manages account information including ID, balance, and interest rate.
 */
public class BankAccount {
  private int accountId;
  private double balance;
  private double rate;

  /**
   * Constructs a new BankAccount with specified account ID, initial balance, and interest rate.
   *
   * @param accountId The unique identifier for the account
   * @param balance The initial balance of the account
   * @param rate The interest rate for the account
   * @throws IllegalArgumentException if balance or rate is negative
   */
  public BankAccount(int accountId, double balance, double rate) {
    setAccountId(accountId);
    setBalance(balance);
    setRate(rate);
  }

  /**
   * Constructs a new BankAccount with specified account ID and default values.
   * Balance and rate are initialized to 0.0.
   *
   * @param accountId The unique identifier for the account
   */
  public BankAccount(int accountId) {
    this.accountId = accountId;
    this.balance = 0.0;
    this.rate = 0.0;
  }

  /**
   * Constructs a new BankAccount with default values.
   * Account ID, balance, and rate are initialized to 0.
   */
  public BankAccount() {
    this.accountId = 0;
    this.balance = 0.0;
    this.rate = 0.0;
  }

  /**
   * Gets the account ID.
   *
   * @return The account's unique identifier
   */
  public int getAccountId() {
    return accountId;
  }

  /**
   * Sets the account ID.
   *
   * @param accountId The new account ID to set
   */
  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

  /**
   * Gets the current balance of the account.
   *
   * @return The current balance
   */
  public double getBalance() {
    return balance;
  }

  /**
   * Sets the balance of the account.
   *
   * @param balance The new balance to set
   * @throws IllegalArgumentException if balance is negative
   */
  public void setBalance(double balance) {
    if (balance < 0) {
      throw new IllegalArgumentException("Balance cannot be negative.");
    }
    this.balance = balance;
  }

  /**
   * Gets the interest rate of the account.
   *
   * @return The current interest rate
   */
  public double getRate() {
    return rate;
  }

  /**
   * Sets the interest rate of the account.
   *
   * @param rate The new interest rate to set
   * @throws IllegalArgumentException if rate is negative
   */
  public void setRate(double rate) {
    if (rate < 0) {
      throw new IllegalArgumentException("Rate cannot be negative.");
    }
    this.rate = rate;
  }

  /**
   * Deposits the specified amount into the account.
   *
   * @param amount The amount to deposit
   * @throws IllegalArgumentException if amount is negative
   */
  public void deposit(double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("Deposit amount must be positive.");
    }
    this.balance += amount;
  }

  /**
   * Withdraws the specified amount from the account.
   *
   * @param amount The amount to withdraw
   * @throws IllegalArgumentException if amount is negative or exceeds current balance
   */
  public void withdraw(double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("Withdrawal amount must be positive.");
    }
    if (amount > this.balance) {
      throw new IllegalArgumentException("Insufficient funds for withdrawal.");
    }
    this.balance -= amount;
  }

  /**
   * Returns a string representation of the bank account.
   *
   * @return A string containing the account ID, balance, and rate
   */
  @Override
  public String toString() {
    return "BankAccount{" +
        "accountId=" + accountId +
        ", balance=" + balance +
        ", rate=" + rate +
        '}';
  }
}