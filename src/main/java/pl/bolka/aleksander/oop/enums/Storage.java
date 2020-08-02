package pl.bolka.aleksander.oop.enums;

public enum Storage implements Saveable {

  DATABASE {
    @Override
    public String getTarget() {
      return "jdbc:postgresql://localhost:5432/example";
    }
  },
  FILE {
    @Override
    public String getTarget() {
      return "/home/abolka/Projects/Szkolenia/Java-zaawansowana/projects/Java-zaawansowana-OOP/storage.txt";
    }
  };


}
