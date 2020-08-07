package pl.bolka.aleksander.oop.annotation;

public @interface StringInputWithAnnotation {

  String name();
  int max();
  InputType inputType() default InputType.SPECIAL;
  PosibleValues posibleValues();

}
