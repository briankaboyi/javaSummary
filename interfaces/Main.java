package interfaces;
//An interface is a completely "abstract class" that is used to group related methods with empty bodies

//To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class
public class Main {
    public static void main(String args[]){
        Pig pig= new Pig();
        pig.makeSound();
        pig.sleep();
        pig.method1();
        pig.method2();
    }
}
interface Animal{//interface method
    public void makeSound();
    public void sleep();

}
interface MyMethod{
    public void method1();
}
interface MyMethod2{
    public void method2();
}
class Pig implements Animal,MyMethod,MyMethod2{ //implementing multiple methods(using commas)
    public void makeSound(){
        System.out.println("pig says wee wee");
    }
    public void sleep(){
        System.out.println("zzz");
    }
    public void method1(){
        System.out.println("method1 interface");
    }
    public void method2(){
        System.out.println("method2 interface");
    }
}