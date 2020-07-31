package pl.bolka.aleksander.oop.generics.widlcards;

public class FakeCar extends Car<PetrolEngine, DieselEngine> {

  public FakeCar() {
    super(new PetrolEngine());
    setPart(new DieselEngine());
  }
}
