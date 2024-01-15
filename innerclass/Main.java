package innerclass;
//In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

//To access the inner class, create an object of the outer class, and then create an object of the inner class
public class Main {
    public static void main (String args[]){
        OuterClass outerclass = new OuterClass();
        OuterClass.InnerClass innerclass = outerclass.new InnerClass();
        // OuterClass.InnerClass innerclass = new OuterClass.InnerClass();
        innerclass.sum(outerclass.x,innerclass.y);
        System.out.println(outerclass.x+innerclass.y);
    }
   
}
//An inner class can also be static, which means that you can access it without creating an object of the outer class.

//innerclasses that are not static have access to attributes and methods of the outerclass.
class OuterClass{
    int x =10;
    class InnerClass{
        int y = 5;
        public void sum(int a,int b){
            System.out.println(a+b+y);
        }
    } 
}