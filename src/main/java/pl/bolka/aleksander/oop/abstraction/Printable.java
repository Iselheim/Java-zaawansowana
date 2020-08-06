package pl.bolka.aleksander.oop.abstraction;

public interface Printable {

  void print();

}

interface ClassPrintable {

  default void printClass(){
    System.out.println(this.getClass().getSimpleName());
  }
}
