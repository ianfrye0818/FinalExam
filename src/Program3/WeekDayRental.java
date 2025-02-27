package Program3;

class WeekDayRental extends Rental {
  private static final double RATE = 79.0;

  public WeekDayRental(String name, int numberOfDays, double additionalFees) {
    super(name, numberOfDays, additionalFees);
  }

  @Override
  public void payRental() {
    double total = (getNumberOfDays() * RATE) + getAdditionalFees();
    System.out.printf("%s's Weekday Rental Amount: $%.2f%n", getName(), total);
  }
}
