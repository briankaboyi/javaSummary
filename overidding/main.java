package overidding;
// Method overriding is a concept in object-oriented programming (OOP) where a subclass provides a specific implementation for a method that is already defined in its superclass. 
public class main {
    public static void main(String[] args){
        Child childObj = new Child(); 

        System.out.println(childObj.myMethod());
        System.out.println(childObj.anotherMethod());
    }
}

class Parent{
    String myMethod(){
    return "im the parent class";
    }
    String anotherMethod(){
        return "still the parent";
    }
}

class Child extends Parent{
    String myMethod(){
        return  "im the child class";
    }
}