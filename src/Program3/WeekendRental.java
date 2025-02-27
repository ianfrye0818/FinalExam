package Program3;

/**
 * Represents a weekend rental, extending the base Rental class.
 * This class handles rentals specifically for weekend periods with a special
 * weekend rate.
 */
class WeekendRental extends Rental {
  /** The rate charged per day for weekend rentals */
  private double weekendRate;

  /**
   * Constructs a new WeekendRental with the specified details.
   * 
   * @param name           The name of the customer
   * @param numberOfDays   The duration of the rental in days
   * @param additionalFees Any extra charges associated with the rental
   * @param weekendRate    The daily rate for weekend rentals
   */
  public WeekendRental(String name, int numberOfDays, double additionalFees, double weekendRate) {
    super(name, numberOfDays, additionalFees);
    this.weekendRate = weekendRate;
  }

  /**
   * Gets the weekend daily rate.
   * 
   * @return The rate charged per day for weekend rentals
   */
  public double getWeekendRate() {
    return weekendRate;
  }

  /**
   * Sets the weekend daily rate.
   * 
   * @param weekendRate The new weekend rate to set
   */
  public void setWeekendRate(double weekendRate) {
    this.weekendRate = weekendRate;
  }

  /**
   * Calculates and displays the total rental amount for weekend rentals.
   * The total is calculated as (number of days × weekend rate) + additional fees.
   */
  @Override
  public void payRental() {
    double total = (getNumberOfDays() * weekendRate) + getAdditionalFees();
    System.out.printf("%s's Weekend Rental Amount: $%.2f%n", getName(), total);
  }
}