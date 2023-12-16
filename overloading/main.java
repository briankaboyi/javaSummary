package overloading;

public class main {
    //With method overloading, multiple methods can have the same name with different parameters:
//    Instead of defining two methods that should do the same thing, it is better to overload one.

    static int myMethod(int a,int b){
        return a*b;
    }
    static double myMethod(double a, double b){
        return a*b;
    }

    public static void main(String[] args){
        System.out.println(myMethod(2, 4));
        System.out.println(myMethod(28.4, 4.5));
    }
}
