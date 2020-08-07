package pl.bolka.aleksander.oop.collections;

import java.util.*;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    //Set
    hashSets();
    treeSets();
    linkedHashSets();

    //List
    arrayList();
    linkedList();

    //Map
    hashMaps();
    linkedHashMap();
    treeMap();
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

    for (User user : users2) {

    }
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

    for (String element : words) {

    }
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

  private static void hashMaps() {
    Map<Integer, String> hashMap = new HashMap<>();
    hashMap.put(1, "Jeden");
    hashMap.put(2, "Dwa");
    hashMap.put(3, "Trzy");
    hashMap.put(2, "DwaDwa");

    int size = hashMap.size();
    System.out.println(size);

    String byKey = hashMap.get(1);
    System.out.println(byKey);

    System.out.println(hashMap);
    String remove = hashMap.remove(2);
    System.out.println(remove);
    System.out.println(hashMap);

    boolean b = hashMap.containsKey(3);
    System.out.println(b);

    boolean jeden = hashMap.containsValue("Jeden");
    System.out.println(jeden);

    Set<Integer> integers = hashMap.keySet();
    System.out.println(integers);

    Collection<String> values = hashMap.values();
    System.out.println(values);

    Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
    System.out.println(entries);

    //    hashMap.stream();
    Stream<Map.Entry<Integer, String>> stream = entries.stream();

    HashMap<String, User> userHashMap = new HashMap<>();
    userHashMap.put("Rysiu",new ExtendedUser("Rysiu", 33));

//    userHashMap.for;
    for (Map.Entry<String, User> stringUserEntry : userHashMap.entrySet()) {

    }
  }

  public static void linkedHashMap() {
    Map<Integer, String> ageToNames = new LinkedHashMap<>();
    ageToNames.put(20, "Gosia");
    ageToNames.put(40, "Kasia");
    ageToNames.put(30, "Ania");

  }

  public static void treeMap(){
    Map<Integer, Integer> numberToDigitsSum = new TreeMap<>();
    numberToDigitsSum.put(33, 6);
    numberToDigitsSum.put(19, 10);
    numberToDigitsSum.put(24, 6);
    numberToDigitsSum.forEach((key, value) -> System.out.println(key + " " + value));

//    Map<UserWithoutHash, Integer> userWithoutHash = new TreeMap<>();
//    userWithoutHash.put(new UserWithoutHash("c"), 1);
//    userWithoutHash.put(new UserWithoutHash("z"), 1);
//    userWithoutHash.put(new UserWithoutHash("a"), 1);
//    System.out.println(userWithoutHash);


    Map<UserWithComparable, Integer> users = new TreeMap<>();
    users.put(new UserWithComparable("c"), 1);
    users.put(new UserWithComparable("z"), 1);
    users.put(new UserWithComparable("a"), 1);
    System.out.println(users);

    Map<String, Integer> sorted = new TreeMap<>(String::compareTo);
    sorted.put("c", 1);
    sorted.put("a", 1);
    sorted.put("z", 1);
    System.out.println(sorted);
  }
}
