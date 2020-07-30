package pl.bolka.aleksander.oop.abstraction;

public class Cat extends Animal implements Printable{

  public Cat(String name, int age) {
    super(name, age);
  }

  @Override
  public void voice() {
    System.out.println("Meow");
  }

  @Override
  public void print() {

  }
}
