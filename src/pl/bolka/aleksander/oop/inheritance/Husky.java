package pl.bolka.aleksander.oop.inheritance;

public class Husky extends Dog {

  private String color;

  public Husky(String name, String color) {
    super(name);
    this.color = color;
  }

  @Override
  public void voice() {
    super.voice();
    System.out.println("Woooof");
  }

  public void addOneYear() {
    setAge(getAge() + 1);
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
