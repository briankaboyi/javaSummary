package accessmodifiers;

public class main {

  // Access modifiers set the access level for classes, attributes, methods and constructors.

  /*  We divide modifiers into two groups:
    Access Modifiers - controls the access level
    Non-Access Modifiers - do not control access level, but provides other functionality
   */

  /*
    public	-  The class is accessible by any other class	
    default -   The class is only accessible by classes in the same package. This is used when  you don't specify a modifier.

*/

  // for attributes methods and constructors
  /*
  public-  	The code is accessible for all classes	
    private	-   The code is only accessible within the declared class	
    default    -	The code is only accessible in the same package. This is used when you don't specify a modifier.
    protected - 	The code is accessible in the same package and subclasses.
 */
  //NON ACCESS MODIFIERS
  /*
 For classes, you can use either final or abstract:


final - 	The class cannot be inherited by other classes 
abstract -  	The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.
 */

  //attributes and methods
  /*
  * 
  final	-   Attributes and methods cannot be overridden/modified
static	-   Attributes and methods belongs to the class, rather than an object
abstract	-   Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).
transient - 	Attributes and methods are skipped when serializing the object containing them
synchronized -  	Methods can only be accessed by one thread at a time
volatile -  	The value of an attribute is not cached thread-locally, and is always read from the "main memory"
  */

  //FINAL
  //   If you don't want the ability to override existing attribute values, declare attributes as final

  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // ABSTRACT
  // An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:
  
// MAIN method
  public static void main(String[] args) {
    mainone myObj = new mainone();
    //myObj.x=50; //throws an error
    //myObj.PI = 25;//throws an error
    System.out.println(myObj.x);
    myStaticMethod();
    myObj.myPublicMethod();

    Student me = new Student();
    me.study();
  }
}
