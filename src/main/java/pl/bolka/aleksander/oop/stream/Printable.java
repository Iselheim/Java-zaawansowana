package pl.bolka.aleksander.oop.stream;

import java.time.LocalDate;

// SAM
//@FunctionalInterface
public interface Printable {

  String asString();

}

//@FunctionalInterface
interface Mathematical {

  int add(int a, int b);

  int divide(int a , int b);

}

// SAM
//@FunctionalInterface
interface Printable2 {

  String asString();

  default void print(){
    System.out.println(asString());
  }
}

