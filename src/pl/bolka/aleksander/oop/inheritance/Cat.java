package pl.bolka.aleksander.oop.inheritance;

public class Cat extends Animal {

  public Cat(String name, int age) {
    super(name, age);
  }

  @Override
  public void voice() {
    System.out.println("Meow");
  }
}
