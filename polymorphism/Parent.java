package polymorphism;
// Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
//  Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
class Parent {

  void makeSound() {
    System.out.println("This animal makes sounds");
  }
}

class ChildOne extends Parent {

  void makeSound() {
    System.out.println("this sound is from child one");
  }
}

class Main {

  public static void main(String args[]) {
    ChildOne mychild = new ChildOne();
    Parent myParent = new Parent();
    myParent.makeSound();
    mychild.makeSound();
    // same object but in different forms
  }
}
