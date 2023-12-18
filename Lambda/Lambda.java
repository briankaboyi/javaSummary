package Lambda;
import java.util.ArrayList;

//A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
public class Lambda {
    public static void main (String args[]){
        ArrayList<String> myarray = new ArrayList<String>();
        myarray.add("five");
        myarray.add("six");
        myarray.add("seven");
        myarray.add("eight");
        myarray.forEach(n->System.out.println(n));//lambda
    }

   
}
