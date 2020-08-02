package pl.bolka.aleksander.oop.innerClasses;

public class Main {

  public static void main(String[] args) {
    OuterClass outerClass = new OuterClass();
    OuterClass.InnerClass innerClass = outerClass.new InnerClass();

    OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();

    outerClass.createLocalInnerClass();

    outerClass.createAnonymousClass();

    outerClass.sortNumbers();

  }
}
