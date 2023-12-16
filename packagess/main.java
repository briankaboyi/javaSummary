package packagess; //to create a package you use the package keyword

import java.util.*; //importing a class from JAVA API

// Scanner class is pre built class in the java.util package. it comes with its own attributes and methods
// to import the entire package, youll ommit the class name and just import java.util,and add an asterix (*) in place of the class name.

class MyPackage {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    String userName;

    // Enter username and press Enter
    System.out.println("Enter username");
    userName = myScanner.nextLine();

    System.out.println("Username is: " + userName);
  }
}
