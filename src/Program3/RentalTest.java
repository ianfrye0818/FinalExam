package Program3;

class WeekendRental extends Rental {
  private double weekendRate;

  public WeekendRental(String name, int numberOfDays, double additionalFees, double weekendRate) {
    super(name, numberOfDays, additionalFees);
    this.weekendRate = weekendRate;
  }

  public double getWeekendRate() {
    return weekendRate;
  }

  public void setWeekendRate(double weekendRate) {
    this.weekendRate = weekendRate;
  }

  @Override
  public void payRental() {
    double total = (getNumberOfDays() * weekendRate) + getAdditionalFees();
    System.out.printf("%s's Weekend Rental Amount: $%.2f%n", getName(), total);
  }
}