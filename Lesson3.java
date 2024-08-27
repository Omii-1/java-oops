package oops;

public class Lesson3 {
  public static void main(String[] args) {
    // Inheritance -
    // it allow us to crate new class (child) from existing class(parent)
    // parent class allowed child class to use their properties and methods
    // it used for reusability

    // multilevel inheriance - 
    // it allowed 
    

    // creating object using car class
    Car obj = new Car();
    // inherit vehicle proprties from vehicle (parent) class
    obj.wheelsCount = 4;
    obj.color = "Red";
    obj.start();
    obj.start1();

    // method overriding -
    // if child class created method which aleready declared in parent class then child method overide the parent method
    Car obj1 = new Car();
    obj1.start1();

    // super keyword -
    // used to refer to instance of immediate parent class
    // used to invoke method and constructor of immediate parent class

    // final keyword -
    // it is non-access modifier 
    // used to define entities that cannot changes or modified
    // used on variable, methods, classes
    // to dont allowed class to create sub classes then use fianl keyword to class

    Vehicle v1 = new Vehicle();
    // v1.gears = 5; // throw errors because of final keyword
  }
}

// parent class
class Vehicle{
  int wheelsCount;

  final int gears = 4; // we cannot change

  void start(){
    System.out.println("vehicle has " + wheelsCount + " wheels.");
  }

  void start1(){
    System.out.println("start1 method from parent");
  }

  final void accelerate(){
    System.out.println("vehicle is accelerate");
  }

}

// child class
// extends - used to define parent class
class Car extends Vehicle{
  String color;
  void start1(){
    super.start1(); // it invoke parent method instaed of its own method 
    System.out.println("color of car : " + this.color);
  }

  // it throw error because of final keyword
  // void accelerate(){
  //   System.out.println("hii");
  // }
}