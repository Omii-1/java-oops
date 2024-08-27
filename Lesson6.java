package oops;

public class Lesson6{

  public static void main(String[] args) {
    // Abstract class / method -
    // we cannot create object of abstract class
    // abstract class can have regular method and abstract method
    // method that dosent have its body / Implementations known as abstract method
    // we can create child classes of abstract class 
    // we can access members of abstract class using object of child class
    // if abstract class includes any abstract method , then all child classes inherit from the superclass must provided the implementations of abstract method
    // if you have abstract method then it compulsory to make that class abstract 

    // creating method of child class using parent abstract class
    Car c1 = new Car();
    c1.accelerate();
    c1.brakes(4);
    c1.honks();

    // Abstraction -
    // it allow us to hide unnecessary details and only show needed information
    // allow us to manage complexity by hiding details with simpler, higher-level idea

    // interface keyword -
    // it is fully abstract class
    // includes group of abstract methods
    // used to create interface in java
    // like abstract class, we cannot create object of interfaces.
    // to use interface, other class must implement it.
    // we use implements keyword to implement an interface
    // same as abstract class, it help us to achieve abstraction in java
    // also used to achieve multiple inheritance in java
    Monkey monkey = new Monkey();
    monkey.eats();
    monkey.sing();
    System.out.println(monkey.LEGS);
  }
}

// create abstract class
abstract class Vehicle{

  abstract void accelerate(); // create abstract method which dont have body

  abstract int brakes(int wheels);

  void honks(){   // regular method
    System.out.println("Vehicle honks");
  }
}

// created child class of abstract class
class Car extends Vehicle{

  // adding body in abstract method
  void accelerate(){
    System.out.println("Car is accelerating.");
  }

  int brakes(int wheels){
    return wheels;
  }
}

// --------- interface example --------

interface Animal{

  // if we not create default method then we dont have to use abstract keyword it automatically become abstract
  void eats();

  // default implemantation
  // we can oveeride in child class
  default void walk(){
    System.out.println("Animal is walking");
  }
}

interface Human{

  int LEGS = 4;  // default public static final
  void sing();
}

// inherit method from multiple classes
// if we use abstract if we cannot do that
class Monkey implements Animal, Human{

  public void eats(){
    System.out.println("monkey is eating");
  }

  public void sing(){
    System.out.println("monkey is singing");
  }
}