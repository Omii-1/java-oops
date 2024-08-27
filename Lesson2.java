package oops;

public class Lesson2 {
  public static void main(String[] args) {

    // method overloading -
    // we can create multiple methos with same name but different properties 
    // it has same name and same properties then it throws error
    // it check methods in runtime
    Greet g1 = new Greet();
    g1.greetings();
    Greet g2 = new Greet();
    g2.greetings("Om");
    
    // constructor -
    // are invoked implicitly when initiate objects
    // rule to create constructor
    //    - name is same as class
    //    - not have return type
    // constructor are also overload
    // if class dosen't have constructor, java automatically creates default constructor during runtime called default constructor. 
    // default constructor initialize variable with default values 
    // cannot be abstract or static or final
    // can be overloaded but not overridden
    Greet g3 = new Greet();
    g3.print();

    // this keyword -
    // used to refer to current object inside method or constructor
    // also use to invoke method and constructor of current class

  }
}

class Greet{
  int a, b;

  // creating constructor
  // if we dont create constructor then default constructor look like this
  // public Greet(){
  //   a = 0;
  //   b = 0;
  // }

  // create new constructor
  // override on default constructor
  public Greet(){
    this.a = 5;
    this.b = 4;
    this.print(); 
    System.out.println("Cresting a constructor");
    // it runs automatically in runtime when create new object
  }

  void print(){
    System.out.println(a + b);
  }

  // creating methods with same name and different properties
  void greetings(){
    System.out.println("Hello, good morning.");
  }
  
  void greetings(String name){
    System.out.println("Hello " + name + ", good morning.");
  }
}
