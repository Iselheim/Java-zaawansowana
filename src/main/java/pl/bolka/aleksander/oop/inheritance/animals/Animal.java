package pl.bolka.aleksander.oop.inheritance.animals;

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

  protected final void setAge(int age) {
    this.age = age;
  }

  private void test() {

  }

  @Override
  public String toString() {
    return "Animal{" +
           "name='" + name + '\'' +
           ", age=" + age +
           '}';
  }
}
