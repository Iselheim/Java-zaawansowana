package pl.bolka.aleksander.oop.abstraction;

public abstract class Animal {

  private String name;

  private int age;

  public Animal() {
  }

  public Animal(String name) {
    this.name = name;
  }

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public abstract void voice();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  protected void setAge(int age) {
    this.age = age;
  }
}
