package accessmodifiers;

public class mainone {

  final int x = 10;
  final double PI = 3.14;

  public void myPublicMethod() {
    System.out.println("public methods must be called by creating objects");
  }


}
abstract class Test {

    public abstract void study();
  }

  class Student extends Test {

    public void study() {
      System.out.println("study all day");
    }
  }