package pl.bolka.aleksander.oop.inheritance.animals;

public class Cat extends Animal {

  public Cat(String name, int age) {
    super(name, age);
  }

  @Override
  public void voice() {
    System.out.println("Meow");
  }

  @Override
  public String toString() {
    return "Cat{} " + super.toString();
  }
}
