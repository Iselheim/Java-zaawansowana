package pl.bolka.aleksander.oop.collections;

public class UserWithoutHash {

  private String name;

  public UserWithoutHash(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
           "name='" + name + '\'' +
           "} " + hashCode();
  }
}


