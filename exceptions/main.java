package exceptions;

public class main {

  public static void main(String[] args) {
    // exceptions means errors encountered during execution of java code
    // try statement allows you to defice a block of code to be tested for errors while its being executed
    // catch statement allows you to define a block of code to be executed , if an error occurs in the try block
    try {
      String[] wordArr = new String[1];
      String test = "test";
      String newName = test + test;
      wordArr[1] = newName;
    } catch (Exception e) {
      System.out.println("smthn aint right " + e);
    }finally{ //finnaly allows you to define a block of code to be executed after try and catch ,regardless of the result
        System.out.println("but we keep going regardless");
    }
  }
}
