package pl.bolka.aleksander.oop.collections;

public class UserWithComparable implements Comparable<UserWithComparable> {

  private String name;

  public UserWithComparable(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(UserWithComparable userWithComparable) {
    return name.compareTo(userWithComparable.getName());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "UserWithComparable{" +
           "name='" + name + '\'' +
           '}';
  }
}
