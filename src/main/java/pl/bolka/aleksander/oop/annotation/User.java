package pl.bolka.aleksander.oop.annotation;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class User {

  private String name;

  private int age;

}
