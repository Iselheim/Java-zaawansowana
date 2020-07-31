package pl.bolka.aleksander.oop.generics;

public class GenericClass<T> {

  private T generic;

  public GenericClass(T generic) {
    this.generic = generic;
  }

  public T getGeneric() {
    return generic;
  }

  public void setGeneric(T generic) {
    this.generic = generic;
  }
}
