package pl.bolka.aleksander.oop.enums;

public class SaverImpl implements Saver {
  @Override
  public void save(Saveable saveable) {
    String target = saveable.getTarget();
    System.out.println("Zapisje do " +target);
  }
}
