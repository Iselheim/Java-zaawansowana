package pl.bolka.aleksander.exercise.streams;

public class Owner {

  private String name;

  private String pesel;

  private Address address;

  private int age;

  public Owner(String name, String pesel, Address address, int age) {
    this.name = name;
    this.pesel = pesel;
    this.address = address;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPesel() {
    return pesel;
  }

  public void setPesel(String pesel) {
    this.pesel = pesel;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
