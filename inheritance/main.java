package inheritance;

// class Vehicle {

//   protected String brand = "Ford";

//   public void honk() {
//     System.out.println("Tuut, tuut!");
//   }
// }

// class Car extends Vehicle {

//   private String modelName = "Mustang";

//   public static void main(String[] args) {
//     Car myCar = new Car();

//     myCar.honk();
//     System.out.println(myCar.brand + " " + myCar.modelName);
//   }
// }

class Parent{
     String surname = "kaboyi";
    void work(){
        System.out.println("HUSTLE , WORK ,GRIND");
    }
    Parent(){
        System.out.println("this is the parent class");
    }
}

class Child extends Parent{
    private String myName = "Brian";
    String surname = "mkaboyi";
    Child(){
        super();
        System.out.println("this is the child class");
    }
    void showNames(){
        System.out.println(this.surname +" "+ super.surname);
    }
     public static void main (String[] args){
        Child me = new Child();
        me.work();
        me.showNames();
        
     }
}
