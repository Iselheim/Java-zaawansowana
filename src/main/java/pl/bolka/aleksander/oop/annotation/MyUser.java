package pl.bolka.aleksander.oop.annotation;

public class MyUser {

  @StringInput(name = "number2")
  @StringInputBase(name = "name", inputType = InputType.NORMAL, max = 50)
  private String name;

    @StringInputWithAnnotation(max = 150, name = "address",
      posibleValues = @PosibleValues( {"Kraków", "Warszawa"}))
  private String address;

  public void add(Integer number1, @StringInput(name = "number2") String number2){

  }

}
