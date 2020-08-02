package pl.bolka.aleksander.oop.innerClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class OuterClass {

  public class InnerClass {

  }

  public static class InnerStaticClass {

  }

  public void createLocalInnerClass(){
    class LocalInnerClass {

    }
    LocalInnerClass localInnerClass = new LocalInnerClass();
    System.out.println(localInnerClass);
  }

  public void createAnonymousClass(){
    Hello hello = new Hello() {
      @Override
      public String getName() {
        return "AnonymousClass";
      }
    };
    System.out.println(hello.getName());
    hello.hello();
  }

  public void someMethod() {
    final String finalVariable = "final variable";
    String effectivelyFinalVariable = "effectively final variable";
    String nonFinalVariable = "non final variable";

    class InnerClass {
      public void saySomething() {
        System.out.println(finalVariable);
        System.out.println(effectivelyFinalVariable);
      }
    }

    InnerClass instance = new InnerClass();
    instance.saySomething();

    nonFinalVariable = "new value";
  }

  public void sortNumbers() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(7);
    numbers.add(1);
    numbers.add(3);
    numbers.add(12);
    System.out.println("Nieposortowane: " + numbers);

    numbers.sort(new Comparator<Integer>() {
      @Override
      public int compare(Integer number1, Integer number2) {
        return number1.compareTo(number2);
      }
    });
    System.out.println("Posortowane: " + numbers);
  }
}
