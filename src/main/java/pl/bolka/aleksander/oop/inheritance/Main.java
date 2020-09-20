package pl.bolka.aleksander.oop.inheritance;

import pl.bolka.aleksander.oop.inheritance.animals.*;

public class Main {

  public static void main(String[] args) {
    Animal animal = new Animal("bird");
    Cat cat = new Cat("Garfield", 10);
    Dog dog = new Dog("Reksio");
    Animal husky = new Husky("Szarik", "biały");

    Animal animal1 = new Animal("Kot");
    Animal animal2 = new Animal("Pies");

    voice(animal1);
    voice(animal2);

  }

  private static void voice(Animal animal1) {
    if (animal1.getName().equals("Kot")){
      System.out.println("Meow");
    } else if (animal1.getName().equals("Pies")){
      System.out.println("Woof");
    }
  }

}
