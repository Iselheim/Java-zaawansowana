package pl.bolka.aleksander.oop.annotation;

//@SuppressWarnings(value = "Jakis error")
//@SuppressWarnings("Jakis error")
//@SuppressWarnings(value = {"Jakis error", "jakis error 2"})
@SuppressWarnings({"Jakis error", "jakis error 2"})
//@Override
public class Main extends MainBase {

  public static void main(String[] args) {
    User user = new User();
    User janek = new User("Janek", 22);
    janek.getAge();
    janek.setName("Waldek");
    System.out.println(janek);
  }

  @Override
  public void someMethod() {
    super.someMethod();
  }

  @Deprecated
  public void oldMethod(){

  }
}
