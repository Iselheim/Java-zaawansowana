package pl.bolka.aleksander.oop.composition;

public class User {

  private String name;

  private Address address;

  public User() {
  }

  public User(String name, Address address) {
    this.name = name;
    this.address = address;
  }
}
