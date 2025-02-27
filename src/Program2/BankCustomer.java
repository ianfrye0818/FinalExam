package Program2;

public class BankCustomer {
  private BankAccount checkingAccount;
  private BankAccount savingsAccount;
  private BankAccount moneyMarketAccount;
  private String customerName;

  // Full constructor
  public BankCustomer(String customerName, BankAccount checkingAccount, BankAccount savingsAccount,
      BankAccount moneyMarketAccount) {
    this.customerName = customerName;
    this.checkingAccount = checkingAccount;
    this.savingsAccount = savingsAccount;
    this.moneyMarketAccount = moneyMarketAccount;
  }

  // Partial constructor
  public BankCustomer(String customerName) {
    this(customerName, new BankAccount(), new BankAccount(), new BankAccount());
  }

  // Non-argument constructor
  public BankCustomer() {
    this("Unknown Customer", new BankAccount(), new BankAccount(), new BankAccount());
  }

  // Getters and Setters
  public BankAccount getCheckingAccount() {
    return checkingAccount;
  }

  public void setCheckingAccount(BankAccount checkingAccount) {
    this.checkingAccount = checkingAccount;
  }

  public BankAccount getSavingsAccount() {
    return savingsAccount;
  }

  public void setSavingsAccount(BankAccount savingsAccount) {
    this.savingsAccount = savingsAccount;
  }

  public BankAccount getMoneyMarketAccount() {
    return moneyMarketAccount;
  }

  public void setMoneyMarketAccount(BankAccount moneyMarketAccount) {
    this.moneyMarketAccount = moneyMarketAccount;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  // Method to get total balance of all accounts
  public double getTotalBalance() {
    return checkingAccount.getBalance() + savingsAccount.getBalance() + moneyMarketAccount.getBalance();
  }

  // Override toString method for easier output
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