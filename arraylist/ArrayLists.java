package arraylist;
import java.util.ArrayList;
import java.util.Collections;
//an arraylist is a resizable array found in java.util package.
//in built in arrays, to add or remove items you have to create a new array while in arraylist you can remove or add items whenever you want.
public class ArrayLists {
    
    // add items
    public static void main(String args[]){
        ArrayList<String> cars = new ArrayList<String>();//create an arraylist object|To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc
        cars.add("Volvo");
        cars.add("mazda");
        cars.add("benz");
        cars.add("range");
        System.out.println(cars);
        // accessig items// USE THE get method
        System.out.println(cars.get(0));
        // accessig items// USE THE set method and specify the index
        cars.set(0,"BMW");
        System.out.println(cars);
        // removing an items// USE THE remove method to remove one item
        cars.remove(0);
        System.out.println(cars);
        // removing all items// USE THE clear method
        cars.clear();
        System.out.println(cars);
        //ArrayList size //use the size method
        System.out.println(cars.size());
        //LOOP THROUGH AN ARRAY LIST usin for loop
        cars.add("volvo");
        cars.add("mazda");
        cars.add("benz");
        cars.add("range");
        for(int i =0; i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        // usin for-each
        for(String i: cars){
            System.out.println(i);
        }
        //SORT AN ARRAYLIST
        //use collections class in java.util package, it includes the sort method for sorting lists alphabetically or numerically
        Collections.sort(cars);
        for(String i :cars){
        System.out.println(i);}
        System.out.println(cars);
        // Collections.sort method is case sensitive
    }
}
