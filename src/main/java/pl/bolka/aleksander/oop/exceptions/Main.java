package pl.bolka.aleksander.oop.exceptions;

public class Main {

  public static void main(String[] args) {
    Main main = new Main();
//    main.uncheckedExcepionMethod();
//    System.out.println("Koniec");

    try {
      main.checkedExceptionMethod();
    } catch (CheckedException e) {
      e.printStackTrace();
    }

    try {
      main.checkedExceptionMethod();
    } catch (CheckedException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Działam zawsze!");
    }

    try {
      main.checkedExceptionMethod(false);
    } catch (CheckedException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Działam zawsze!");
    }

  }

  public void uncheckedExcepionMethod() {
    throw new UncheckedException();
  }

  public void checkedExceptionMethod() throws CheckedException {
    throw new CheckedException();
  }

  public void checkedExceptionMethod(boolean shouldThrow) throws CheckedException {
    if (shouldThrow){
      throw new CheckedException();
    }
  }

}
