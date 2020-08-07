package pl.bolka.aleksander.oop.annotation;

//@StringInput(name = "description")
//@StringInputBase(name = "name", inputType = InputType.NORMAL, max = 50)
public class MyUser {

  @StringInputBase(name = "name", inputType = InputType.NORMAL, max = 50)
  private String name;

//  @StringInputWithAnnotation(max = 150, name = "address",
//      posibleValues = @PosibleValues( {"Kraków", "Warszawa"}))
//  private String address;
//
//  @StringInput(name = "description")
//  private String description;

  public void add(Integer number1, @StringInput(name = "number2") String number2){

  }

}
