package pl.bolka.aleksander.exercise.streams;

public enum Currency {

  PLN(1.0),
  EUR(4.32),
  GBP(4.98);

  private final Double value;

  Currency(Double v) {
    this.value = v;
  }

  public Double getValue() {
    return value;
  }
}
