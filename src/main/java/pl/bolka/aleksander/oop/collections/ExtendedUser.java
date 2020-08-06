package pl.bolka.aleksander.oop.collections;

import java.util.Objects;

public class ExtendedUser extends User {

  private int age;

  public ExtendedUser(String name, int age) {
    super(name);
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }
}
