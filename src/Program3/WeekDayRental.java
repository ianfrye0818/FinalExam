package Program3;

/**
 * Represents a weekday rental, extending the base Rental class.
 * This class handles rentals during weekdays with a fixed daily rate of $79.00.
 */
class WeekDayRental extends Rental {
  /** The fixed daily rate for weekday rentals */
  private static final double RATE = 79.0;

  /**
   * Constructs a new WeekDayRental with the specified details.
   * 
   * @param name           The name of the customer
   * @param numberOfDays   The duration of the rental in days
   * @param additionalFees Any extra charges associated with the rental
   */
  public WeekDayRental(String name, int numberOfDays, double additionalFees) {
    super(name, numberOfDays, additionalFees);
  }

  /**
   * Calculates and displays the total rental amount for weekday rentals.
   * The total is calculated as (number of days × fixed rate of $79.00) +
   * additional fees.
   */
  @Override
  public void payRental() {
    double total = (getNumberOfDays() * RATE) + getAdditionalFees();
    System.out.printf("%s's Weekday Rental Amount: $%.2f%n", getName(), total);
  }
}
