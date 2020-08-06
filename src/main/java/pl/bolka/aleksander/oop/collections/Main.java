package pl.bolka.aleksander.oop.collections;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    //Set
    hashSets();
    treeSets();
    linkedHashSets();

    //List
    arrayList();
    linkedList();
  }

  private static void hashSets() {
    Set<Integer> numbersSet = new HashSet<>();
    System.out.println(numbersSet.isEmpty());
    numbersSet.add(1);
    numbersSet.add(17);
    numbersSet.add(3);
    numbersSet.add(2);
    numbersSet.add(1);
    numbersSet.forEach(element -> {
      System.out.println(element);
    });

    Set<UserWithoutHash> userWithoutHashes = new HashSet<>();
    userWithoutHashes.add(new UserWithoutHash("Janek"));
    userWithoutHashes.add(new UserWithoutHash("Janek"));
    userWithoutHashes.add(new UserWithoutHash("Maciek"));
    userWithoutHashes.add(new UserWithoutHash("Rysiu"));
    userWithoutHashes.forEach(System.out::println);

    Set<User> users = new HashSet<>();
    users.add(new User("Janek"));
    users.add(new User("Janek"));
    users.add(new User("Maciek"));
    users.add(new User("Rysiu"));
    users.forEach(System.out::println);

    Set<User> users2 = new HashSet<>();
    users2.add(new User("Janek"));
    users2.add(new ExtendedUser("Janek",18));
    users2.add(new ExtendedUser("Maciek", 44));
    users2.add(new User("Rysiu"));
    users2.forEach(System.out::println);
  }

  private static void treeSets() {
    Set<Integer> numbersSet = new TreeSet<>();
    numbersSet.add(1);
    numbersSet.add(3);
    numbersSet.add(2);
    numbersSet.add(1);
    numbersSet.forEach(System.out::println);

//    Set<User> users = new TreeSet<>();
//    users.add(new User("Janek"));
//    users.add(new User("Janek"));
//    users.add(new User("Maciek"));
//    users.add(new User("Rysiu"));
//    users.forEach(System.out::println);

    Set<UserWithComparable> comparableUsers = new TreeSet<>();
    comparableUsers.add(new UserWithComparable("Janek"));
    comparableUsers.add(new UserWithComparable("Janek"));
    comparableUsers.add(new UserWithComparable("Maciek"));
    comparableUsers.add(new UserWithComparable("Rysiu"));
    comparableUsers.forEach(System.out::println);

    Set<User> users2 = new TreeSet<>((user, user2) -> user.getName().compareTo(user2.getName()));
    Set<User> users3 = new TreeSet<>(Comparator.comparing(User::getName));
    users2.add(new User("Janek"));
    users2.add(new User("Janek"));
    users2.add(new User("Maciek"));
    users2.add(new User("Rysiu"));
    users2.forEach(System.out::println);
  }

  private static void linkedHashSets() {
    Set<Integer> numbersSet = new LinkedHashSet<>();
    numbersSet.add(1);
    numbersSet.add(3);
    numbersSet.add(2);
    numbersSet.add(1);
    numbersSet.forEach(System.out::println);
  }

  private static void arrayList() {
    List<String> words = new ArrayList<>();
    words.add("to");
    words.add("jest");
    words.add("jakis");
    words.add("napis");
    words.forEach(s -> System.out.print(s + " "));
    System.out.println();

    String word = words.get(2);
    System.out.println(word);

    int i = words.indexOf("to");
    System.out.println(i);

    words.add(0, "Napis:");
    words.forEach(s -> System.out.print(s + " "));
    System.out.println();

    words.remove("Napis:");

    boolean contains = words.contains("napis");
    System.out.println(contains);

    words.sort(String::compareTo);
    words.forEach(System.out::println);
  }

  private static void linkedList() {
    List<String> words = new LinkedList<>();
    words.add("to");
    words.add("jest");
    words.add("jakis");
    words.add("napis");
    words.forEach(s -> System.out.print(s + " "));
    System.out.println();

    String word = words.get(2);
    System.out.println(word);

    int i = words.indexOf("to");
    System.out.println(i);

    words.add(0, "Napis:");
    words.forEach(s -> System.out.print(s + " "));
    System.out.println();

    words.remove("Napis:");

    boolean contains = words.contains("napis");
    System.out.println(contains);

    words.sort(String::compareTo);
    words.forEach(System.out::println);
  }
}
