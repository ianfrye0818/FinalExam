package Program2;

/**
 * Represents a bank customer who can have multiple types of bank accounts.
 * This class manages a customer's checking, savings, and money market accounts.
 */
public class BankCustomer {
  private BankAccount checkingAccount;
  private BankAccount savingsAccount;
  private BankAccount moneyMarketAccount;
  private String customerName;

  /**
   * Constructs a new BankCustomer with specified name and all account types.
   *
   * @param customerName       The name of the customer
   * @param checkingAccount    The customer's checking account
   * @param savingsAccount     The customer's savings account
   * @param moneyMarketAccount The customer's money market account
   */
  public BankCustomer(String customerName, BankAccount checkingAccount, BankAccount savingsAccount,
      BankAccount moneyMarketAccount) {
    this.customerName = customerName;
    this.checkingAccount = checkingAccount;
    this.savingsAccount = savingsAccount;
    this.moneyMarketAccount = moneyMarketAccount;
  }

  /**
   * Constructs a new BankCustomer with specified name and default accounts.
   * Initializes all accounts as new empty bank accounts.
   *
   * @param customerName The name of the customer
   */
  public BankCustomer(String customerName) {
    this(customerName, new BankAccount(), new BankAccount(), new BankAccount());
  }

  /**
   * Constructs a new BankCustomer with default values.
   * Sets customer name to "Unknown Customer" and initializes all accounts as new
   * empty bank accounts.
   */
  public BankCustomer() {
    this("Unknown Customer", new BankAccount(), new BankAccount(), new BankAccount());
  }

  /**
   * Gets the customer's checking account.
   *
   * @return The checking account associated with this customer
   */
  public BankAccount getCheckingAccount() {
    return checkingAccount;
  }

  /**
   * Sets the customer's checking account.
   *
   * @param checkingAccount The new checking account to associate with this
   *                        customer
   */
  public void setCheckingAccount(BankAccount checkingAccount) {
    this.checkingAccount = checkingAccount;
  }

  /**
   * Gets the customer's savings account.
   *
   * @return The savings account associated with this customer
   */
  public BankAccount getSavingsAccount() {
    return savingsAccount;
  }

  /**
   * Sets the customer's savings account.
   *
   * @param savingsAccount The new savings account to associate with this customer
   */
  public void setSavingsAccount(BankAccount savingsAccount) {
    this.savingsAccount = savingsAccount;
  }

  /**
   * Gets the customer's money market account.
   *
   * @return The money market account associated with this customer
   */
  public BankAccount getMoneyMarketAccount() {
    return moneyMarketAccount;
  }

  /**
   * Sets the customer's money market account.
   *
   * @param moneyMarketAccount The new money market account to associate with this
   *                           customer
   */
  public void setMoneyMarketAccount(BankAccount moneyMarketAccount) {
    this.moneyMarketAccount = moneyMarketAccount;
  }

  /**
   * Gets the customer's name.
   *
   * @return The name of the customer
   */
  public String getCustomerName() {
    return customerName;
  }

  /**
   * Sets the customer's name.
   *
   * @param customerName The new name for the customer
   */
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  /**
   * Calculates the total balance across all of the customer's accounts.
   *
   * @return The sum of balances from checking, savings, and money market accounts
   */
  public double getTotalBalance() {
    return checkingAccount.getBalance() + savingsAccount.getBalance() + moneyMarketAccount.getBalance();
  }

  /**
   * Returns a string representation of the bank customer.
   *
   * @return A string containing the customer's name and details of all accounts
   */
  @Override
  public String toString() {
    return "BankCustomer{" +
        "customerName='" + customerName + '\'' +
        ", checkingAccount=" + checkingAccount +
        ", savingsAccount=" + savingsAccount +
        ", moneyMarketAccount=" + moneyMarketAccount +
        '}';
  }
}