package pl.bolka.aleksander.oop.innerClasses;

public interface Hello {

  default void hello() {
    System.out.println("Hi from " + getName());
  }

  String getName();

}
