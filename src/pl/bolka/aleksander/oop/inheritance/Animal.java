package pl.bolka.aleksander.oop.inheritance;

public class Animal {

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

  public void voice(){
    System.out.println("empty");
  }

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
