package pl.bolka.aleksander.oop.generics.widlcards;

public class Passat extends Car<DieselEngine, String> {

  public Passat(DieselEngine engine) {
    super(engine);
  }
}
