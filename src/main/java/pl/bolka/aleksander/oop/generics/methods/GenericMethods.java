package pl.bolka.aleksander.oop.generics.methods;

import pl.bolka.aleksander.oop.generics.widlcards.Car;

public class GenericMethods {

  public <T> void printTable(T[] table){
    for (T t : table) {
      System.out.println(t.toString());
    }
  }

  public <T> T returnFirst(T[] table){
    return table[0];
  }

  public <T extends Car> String getEngineName(T car){
    return car.getEngine().getName();
  }

}
