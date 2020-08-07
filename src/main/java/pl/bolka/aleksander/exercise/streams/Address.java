package pl.bolka.aleksander.exercise.streams;

public class Address {

  private String street;

  private String city;

  private int streetNumber;

  public Address(String street, String city, int streetNumber) {
    this.street = street;
    this.city = city;
    this.streetNumber = streetNumber;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(int streetNumber) {
    this.streetNumber = streetNumber;
  }
}
