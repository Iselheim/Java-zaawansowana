package pl.bolka.aleksander.oop.generics;

public class Main {

  public static void main(String[] args) {
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
    House house = houseGenericClassWithExtends.getT();

    String name = houseGenericClassWithExtends.getName();

//    GenericClassWithExtends<Double> doubleGenericClassWithExtends = new GenericClassWithExtends<Double>();

  }

}
