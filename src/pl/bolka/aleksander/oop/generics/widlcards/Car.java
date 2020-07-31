package pl.bolka.aleksander.oop.generics.widlcards;

public class Car<T extends Engine, T2> extends Machine<T> {

  T2 part;

  public Car(T engine) {
    super(engine);
  }

  public T2 getPart() {
    return part;
  }

  public void setPart(T2 part) {
    this.part = part;
  }
}
