package pl.bolka.aleksander.oop.stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import pl.bolka.aleksander.oop.annotation.User;

public class Main {

  public static void main(String[] args) {
    lambda();
    function();
    supplier();
    consumer();
    predicate();
    optional();
    streams();
  }

  private static void predicate() {
    Predicate<String> predicate = s -> s.length() % 2 == 0;
    boolean result = predicate.test("Jakis długi tekst");

    boolean test = predicate.and(s -> s.startsWith("j"))
                            .test("jakis teskt");
  }

  private static void lambda() {
    Printable printable = new Printable() {
      @Override
      public String asString() {
        return "Printable";
      }
    };
    String s1 = printable.asString();

    Printable printable2 = () -> {
      return "Printable";
    };
    String s2 = printable2.asString();

    Printable printable3 = () -> "Printable";
    String s3 = printable3.asString();

    Addable addable = (number1, number2) -> number1 + number2;

    int add = addable.add(2, 4);
    System.out.println(add);

    Nameable nameable = name -> System.out.println("Nazwa");
    nameable.addName("jakis string");

    LongMethod longMethod = () -> {
      System.out.println("To");
      System.out.println("jest");
      System.out.println("długa");
      System.out.println("metoda");
      return 1;
    };

    int i = longMethod.longMethod();

//    Nameable nameable1 =  name -> throw new RuntimeException();

    Nameable nameable1 = name -> {
      throw new RuntimeException();
    };

    InterfaceWithGenerics<String> interfaceWithGenerics = s -> {
      System.out.println(s);
      return "jakis napis";
    };

    // referencje metod
    Addable addable2 = Integer::sum;

    //Takie same parametry
    Nameable nameable2 = name -> System.out.println(name);
    Nameable nameable2_1 = System.out::println;

    //Wywołanie tylko na argumencie lambdy
    Nameable nameable3 = name -> name.toUpperCase();
    Nameable nameable3_1 = String::toUpperCase;
  }

  private static void function() {
    Function<String, String> stringFunction = s -> s.toUpperCase();
    String word = stringFunction.apply("napis");
    System.out.println(word);
    String longWord = stringFunction.andThen(s -> s + " cos dodam")
                                    .apply("dlugi napis");
    System.out.println(longWord);

    String veryLongWord = stringFunction.andThen(s -> s + " cos dodam")
                                        .andThen(s -> s + " i jeszcze cos dodam")
                                        .apply("dlugi napis");
    System.out.println(veryLongWord);

    String veryLongWordWithCompose = stringFunction.andThen(s -> s + " cos dodam")
                                                   .compose(s -> s + " i jeszcze cos dodam")
                                                   .apply("dlugi napis");
    System.out.println(veryLongWordWithCompose);
  }

  private static void supplier() {
    Supplier<Integer> supplier = () -> 12;
    Integer integer = supplier.get();
    System.out.println(integer);

    Supplier<User> userSupplier = User::new;
    User user = userSupplier.get();
    System.out.println(user);
  }

  private static void consumer() {
    Consumer<User> consumer = user -> System.out.println("Hello im + " + user);
    consumer.accept(new User("Janek", 12));

    consumer.andThen(user -> System.out.println("Tutaj nie korzystam z usera"))
            .accept(new User("Rysiek", 33));
  }

  private static void optional() {
    Optional<User> user = Optional.of(new User());
    boolean present = user.isPresent();
    User user1 = user.get();

    //error
//    Optional<User> user2 = Optional.of(null);

    Optional<User> user2 = Optional.ofNullable(null);
    //better
//    Optional<User> user2 = Optional.empty();
    boolean present1 = user2.isPresent();
    System.out.println(present1);
//    System.out.println(user2.get());

    User orElse = user2.orElse(new User());
    System.out.println(orElse);

    User orElseGet = user2.orElseGet(() -> new User());
    System.out.println(orElseGet);

    user2.ifPresent(lambdaUser -> lambdaUser.setName("Janek"));
    // ==
    if (user2.isPresent()) {
      User user3 = user2.get();
      user3.setName("Janek");
    }
  }

  private static void streams() {
    List<User> users = Arrays.asList(
        new User("user1", 15),
        new User("user2", 33),
        new User("user3", 22),
        new User("user4", 55),
        new User("user5", 66));

    Stream<User> stream = users.stream();

    //WAZNE
//    users.stream().forEach(user -> users.remove(user));

    List<User> usersAbove30 = users.stream()
                                   .filter(user -> user.getAge() > 30)
                                   .collect(Collectors.toList());
    System.out.println(usersAbove30);
    System.out.println(users);

    users.forEach(user -> System.out.println(user.getName()));

    List<String> names = users.stream()
                              .map(User::getName)
                              .collect(Collectors.toList());
    System.out.println(names);

    List<User> sortedUsers = users.stream()
                                  .sorted((user, t1) -> ((Integer) user.getAge()).compareTo(t1.getAge()))
                                  .collect(Collectors.toList());
    System.out.println(sortedUsers);

    Integer ageOfUser2 = users.stream()
                              .filter(Objects::nonNull)
                              .filter(user -> user.getName() != null && !user.getName().isEmpty())
                              .filter(user -> user.getAge() > 0)
                              .filter(user -> user.getName().contains("2"))
                              .sorted(Comparator.comparingInt(User::getAge))
                              .map(User::getAge)
                              .findFirst()
                              .orElseGet(() -> 0);

    Set<User> userSet = users.stream().collect(Collectors.toSet());
    Map<String, String> userMap = users.stream()
                                       .collect(Collectors.toMap(User::getName, User::getName));
    System.out.println(userMap);

    Map<String, User> userMap1 = users.stream()
                                      .collect(Collectors.toMap(User::getName, Function.identity()));
    System.out.println(userMap1);

    Map<String, User> userMap2 =
        users.stream()
             .collect(Collectors.toMap(User::getName, Function.identity(), (user, user2) -> {
               user.setName(user.getName() + user2.getName());
               user.setAge(user.getAge() + user2.getAge());
               return user;
             }));
    System.out.println(userMap2);
  }
}
