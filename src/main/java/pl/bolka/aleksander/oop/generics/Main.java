package pl.bolka.aleksander.oop.generics;

import pl.bolka.aleksander.oop.generics.methods.GenericMethods;
import pl.bolka.aleksander.oop.generics.widlcards.*;

public class Main {

  public static void main(String[] args) {
    genericsBase();
    inheritance();
    wildCards();
    genericMethods();
  }

  private static void genericsBase() {
    GenericClass<Integer> integerGenericClass = new GenericClass<>(12);
    Integer generic = integerGenericClass.getGeneric();
    System.out.println(generic);

    GenericClass<User> userGenericClass = new GenericClass<>(new User("Janek", 123));
    User generic2 = userGenericClass.getGeneric();
    System.out.println(generic2);

    GenericClassWithTwoParameters<Integer, Double> integerDoubleGenericClassWithTwoParameters = new GenericClassWithTwoParameters<>();
    Integer integer = integerDoubleGenericClassWithTwoParameters.getT1();
    Double aDouble = integerDoubleGenericClassWithTwoParameters.getT2();

    GenericClassWithTwoParameters<User, Double> userDoubleGenericClassWithTwoParameters = new GenericClassWithTwoParameters<>();
    User user = userDoubleGenericClassWithTwoParameters.getT1();
    Double aDouble1 = userDoubleGenericClassWithTwoParameters.getT2();

    GenericClassWithTwoParameters<Double, User> doubleUserGenericClassWithTwoParameters = new GenericClassWithTwoParameters<>();
    Double aDouble2 = doubleUserGenericClassWithTwoParameters.getT1();
    User user1 = doubleUserGenericClassWithTwoParameters.getT2();

    GenericClassWithTwoParameters<GenericClass<Integer>, GenericClass<User>> genericClassGenericClassGenericClassWithTwoParameters = new GenericClassWithTwoParameters<>();
    GenericClass<Integer> integerGenericClass1 = genericClassGenericClassGenericClassWithTwoParameters.getT1();
    GenericClass<User> userGenericClass1 = genericClassGenericClassGenericClassWithTwoParameters.getT2();

//    GenericClass integerGenericClass2 = new GenericClass(12);
//    GenericClass<User> badIntegerGenericClass2 = integerGenericClass2;
//    User generic4 = badIntegerGenericClass2.getGeneric();

    GenericClassWithExtends<School> schoolGenericClassWithExtends = new GenericClassWithExtends<>();
    School school = schoolGenericClassWithExtends.getT();

    GenericClassWithExtends<House> houseGenericClassWithExtends = new GenericClassWithExtends<>();
    houseGenericClassWithExtends.setT(new House());
    House house = houseGenericClassWithExtends.getT();

    String name = houseGenericClassWithExtends.getName();

//    GenericClassWithExtends<Double> doubleGenericClassWithExtends = new GenericClassWithExtends<Double>();
  }

  private static void inheritance() {
    Corsa corsa = new Corsa(new PetrolEngine());
    Passat passat = new Passat(new DieselEngine());
    PetrolEngine petrolEngine = corsa.getEngine();
    DieselEngine dieselEngine = passat.getEngine();
  }

  private static void wildCards() {
    GenericsWildcards genericsWildcards = new GenericsWildcards();
    genericsWildcards.method1(new Passat(new DieselEngine()));
//    genericsWildcards.method1_1(new Passat(new DieselEngine()));

    genericsWildcards.method2(new Corsa(new PetrolEngine()));
    genericsWildcards.method2(new Passat(new DieselEngine()));

//    genericsWildcards.method3(new Corsa(new PetrolEngine()));
    genericsWildcards.method3(new FakeCar());

    genericsWildcards.method4(new FakeCar());

//    genericsWildcards.method5(new FakeCar());
  }


  private static void genericMethods() {
    GenericMethods genericMethods = new GenericMethods();
    String[] stringTable = {"raz", "dwa", "trzy"};
    genericMethods.printTable(stringTable);

    Car[] cars = {new FakeCar(), new Corsa(new PetrolEngine()), new Passat(new DieselEngine())};
    genericMethods.printTable(cars);

    System.out.println(genericMethods.returnFirst(stringTable));

    System.out.println(genericMethods.returnFirst(cars));

    System.out.println(genericMethods.getEngineName(cars[1]));
  }
}
