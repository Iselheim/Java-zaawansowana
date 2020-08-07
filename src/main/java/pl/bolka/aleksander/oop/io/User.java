package pl.bolka.aleksander.oop.io;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class User implements Serializable {

  private String name;

  private int age;

}
