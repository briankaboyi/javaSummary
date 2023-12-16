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
    protected String surname = "kaboyi";
    void work(){
        System.out.println("HUSTLE , WORK ,GRIND");
    }
}

class Child extends Parent{
    private String myName = "Brian";
     public static void main (String[] args){
        Child me = new Child();
        me.work();
        System.out.println(me.myName  + " " + me.surname);
     }
}
