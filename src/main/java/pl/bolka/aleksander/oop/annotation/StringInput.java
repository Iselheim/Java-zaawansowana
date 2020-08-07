package pl.bolka.aleksander.oop.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target( {ElementType.FIELD, ElementType.PARAMETER})
public @interface StringInput {

  String name();

  int max() default 50;

  InputType inputType() default InputType.NORMAL;

}
