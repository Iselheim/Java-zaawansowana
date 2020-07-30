package pl.bolka.aleksander.oop.abstraction;

public interface Printable {

  void print();

  default void printClass(){
    System.out.println(this.getClass().getSimpleName());
  }

}
