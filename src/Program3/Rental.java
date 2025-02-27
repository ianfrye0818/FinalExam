package Program3;

/**
 * Abstract base class representing a rental transaction.
 * This class provides the basic structure for different types of rentals,
 * storing common information such as customer name, rental duration, and
 * additional fees.
 */
abstract class Rental {
  /** The name of the customer making the rental */
  private String name;
  /** The number of days for the rental period */
  private int numberOfDays;
  /** Any additional fees associated with the rental */
  private double additionalFees;

  /**
   * Constructs a new Rental with the specified details.
   * 
   * @param name           The name of the customer
   * @param numberOfDays   The duration of the rental in days
   * @param additionalFees Any extra charges associated with the rental
   */
  public Rental(String name, int numberOfDays, double additionalFees) {
    this.name = name;
    this.numberOfDays = numberOfDays;
    this.additionalFees = additionalFees;
  }

  /**
   * Gets the customer's name.
   * 
   * @return The name of the customer
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the customer's name.
   * 
   * @param name The new name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the number of rental days.
   * 
   * @return The number of days for the rental
   */
  public int getNumberOfDays() {
    return numberOfDays;
  }

  /**
   * Sets the number of rental days.
   * 
   * @param numberOfDays The new number of days to set
   */
  public void setNumberOfDays(int numberOfDays) {
    this.numberOfDays = numberOfDays;
  }

  /**
   * Gets the additional fees for the rental.
   * 
   * @return The additional fees amount
   */
  public double getAdditionalFees() {
    return additionalFees;
  }

  /**
   * Sets the additional fees for the rental.
   * 
   * @param additionalFees The new additional fees amount to set
   */
  public void setAdditionalFees(double additionalFees) {
    this.additionalFees = additionalFees;
  }

  /**
   * Abstract method to calculate and display the rental payment.
   * Each rental type must implement its own payment calculation logic.
   */
  public abstract void payRental();
}