package pl.bolka.aleksander.oop.generics;

public class GenericClassWithExtends<T extends Building> {

  private T t;

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public String getName() {
    return t.getName();
  }
}
