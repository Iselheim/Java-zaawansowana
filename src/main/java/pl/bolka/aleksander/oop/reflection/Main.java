package pl.bolka.aleksander.oop.reflection;

import java.lang.reflect.*;

public class Main {

  public static void main(String[] args) {
    classLevel();
    methodLevel();
    fieldLevel();
    constructorLevel();

    annotationUsage();
  }

  private static void classLevel() {
    try {
      Class<?> user = Class.forName("pl.bolka.aleksander.oop.reflection.User");
      Method[] declaredMethods = user.getDeclaredMethods();
      for (Method declaredMethod : declaredMethods) {
        System.out.println(declaredMethod);
      }
      Field[] declaredFields = user.getDeclaredFields();
      for (Field declaredField : declaredFields) {
        System.out.println(declaredField);
      }

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  private static void methodLevel() {
    try {
      Class<?> userClass = Class.forName(User.class.getName());
      User user = (User) userClass.newInstance();
      user.setAge(11);
      System.out.println(user.getAge());

      user.setName("Waldek");
      Method getName = userClass.getMethod("getName");
      Object invoke = getName.invoke(user);
      System.out.println(invoke);

      Method setName = userClass.getMethod("setName", String.class);
      setName.invoke(user, "Janek");
      System.out.println(user.getName());

    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
      e.printStackTrace();
    }
  }

  private static void fieldLevel() {
    try {
      User user = new User("Rysio");
      Field name = User.class.getDeclaredField("name");
      name.set(user, "Waldek");

      name.setAccessible(true);
      name.set(user, "Waldek");

      System.out.println(user.getName());
    } catch (NoSuchFieldException | IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  private static void constructorLevel() {
    try {
      Constructor<User> constructor = User.class.getConstructor(String.class);
      User wiesiek = constructor.newInstance("Wiesiek");
      System.out.println(wiesiek);

    } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
      e.printStackTrace();
    }
  }

  private static void annotationUsage() {
    User user = new User("Bardzo długie imie");
    validateUser(user);
  }

  private static void validateUser(User user) {
    Field[] fields = user.getClass().getDeclaredFields();
    for (Field field : fields) {
      MaxLength annotation = field.getAnnotation(MaxLength.class);
      if (annotation != null) {
        int maxLength = annotation.value();
        field.setAccessible(true);
        try {
          String value = (String) field.get(user);
          if (value.length() > maxLength){
            throw new ValidationException("Field too long, max for this field is: " + maxLength);
          }
        } catch (IllegalAccessException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
