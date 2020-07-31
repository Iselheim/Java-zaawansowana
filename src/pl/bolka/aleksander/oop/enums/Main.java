package pl.bolka.aleksander.oop.enums;

public class Main {

  public static void main(String[] args) {
    Animal cat = Animal.CAT;
    Animal dog = Animal.DOG;

    Coffee americano = Coffee.AMERICANO;
    System.out.println(americano.getMilk());
    System.out.println(americano.getRoast());

    Saveable saveable = Storage.DATABASE;

    System.out.println(saveable.getTarget());

    Animal[] values = Animal.values();

    Animal animal = Animal.valueOf("DOG");

    System.out.println(dog == animal);
    System.out.println(Animal.DOG == animal);
    System.out.println(dog.equals(animal));

    switch (animal) {
      case CAT:
        System.out.println("Meow");
        break;
      case DOG:
        System.out.println("Bark");
        break;
      case SNAKE:
        System.out.println("Sssss");
        break;
    }
  }
}
