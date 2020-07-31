package pl.bolka.aleksander.oop.generics.widlcards;

public class Corsa extends Car<PetrolEngine, String> {

  public Corsa(PetrolEngine engine) {
    super(engine);
  }
}
