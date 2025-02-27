package Program3;

abstract class Rental {
  private String name;
  private int numberOfDays;
  private double additionalFees;

  public Rental(String name, int numberOfDays, double additionalFees) {
    this.name = name;
    this.numberOfDays = numberOfDays;
    this.additionalFees = additionalFees;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumberOfDays() {
    return numberOfDays;
  }

  public void setNumberOfDays(int numberOfDays) {
    this.numberOfDays = numberOfDays;
  }

  public double getAdditionalFees() {
    return additionalFees;
  }

  public void setAdditionalFees(double additionalFees) {
    this.additionalFees = additionalFees;
  }

  public abstract void payRental();
}