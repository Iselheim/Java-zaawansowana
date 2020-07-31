package pl.bolka.aleksander.oop.generics.widlcards;

public abstract class Machine<T extends Engine> {

  private T engine;

  public Machine(T engine) {
    this.engine = engine;
  }

  public T getEngine() {
    return engine;
  }

  public void setEngine(T engine) {
    this.engine = engine;
  }
}
