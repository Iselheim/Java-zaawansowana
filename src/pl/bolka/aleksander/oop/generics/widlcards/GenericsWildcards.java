package pl.bolka.aleksander.oop.generics.widlcards;

public class GenericsWildcards {

  public void method1(Car<DieselEngine, String> car){
    System.out.println(car.getEngine());
    car.setEngine(new DieselEngine());
//    car.setEngine(new PetrolEngine());
  }

  public void method1_1(Car<DieselEngine, Integer> car){
    System.out.println(car.getEngine());
    car.setEngine(new DieselEngine());
//    car.setEngine(new PetrolEngine());
  }

  public void method2(Car<?, ?> car){
    System.out.println(car.getEngine());
    System.out.println(car.getEngine().getName());
//    System.out.println(car.getPart().getName());
//    car.setEngine(new PetrolEngine());
  }

  public void method3(Car<? extends Engine, ? extends Engine> car){
    System.out.println(car.getEngine().getName());
    System.out.println(car.getPart().getName());
  }

  public void method4(Car<? super PetrolEngine, ? super DieselEngine> car){
    System.out.println(car.getEngine().getName());
//    System.out.println(car.getPart().getName());
  }

  public void method5(Car<? super DieselEngine, ? super DieselEngine> car){
    System.out.println(car.getEngine().getName());
//    System.out.println(car.getPart().getName());
  }


}
