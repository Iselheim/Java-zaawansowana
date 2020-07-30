package pl.bolka.aleksander.oop.inheritance;

public class Dog extends Animal {

  private boolean defensive = false;

  public Dog(String name) {
    super(name);
  }

  @Override
  public void voice() {
    System.out.println("Woof");
  }

  public boolean isDefensive() {
    return defensive;
  }

  public void setDefensive(boolean defensive) {
    this.defensive = defensive;
  }
}
