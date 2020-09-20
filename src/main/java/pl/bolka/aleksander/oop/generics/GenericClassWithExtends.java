package pl.bolka.aleksander.oop.generics;

public class GenericClassWithExtends<T extends Building> {

  private T field;

  public T getField() {
    return field;
  }

  public void setField(T field) {
    this.field = field;
  }

  public String getName() {
    return field.getName();
  }
}
