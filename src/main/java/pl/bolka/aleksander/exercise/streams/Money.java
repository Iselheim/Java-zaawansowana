package pl.bolka.aleksander.exercise.streams;

public class Money {

  private Double value;

  private Currency currency;

  public Money(Double value, Currency currency) {
    this.value = value;
    this.currency = currency;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }
}
