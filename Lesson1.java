public class Lesson1 {
  public static void main(String[] args){
    // class -
    // it is blueprint which defines some properties and behaviors
    // it is way to arrange properties and behaviors
    // it not allocated in memeory (metaspace where properties and behaviors are save)
    // it is logical entity
    // it declared once

    // object -
    // it is instance of class which has properties and behaviour attached of classes
    // it allocated in memory when it created (heap memory)
    // it is physical entity
    // we can create multiple classes

    // creating object using dog class
    Dog d1 = new Dog(); // d1 is object
    d1.name = "Tommy";
    d1.bark();

    Dog d2 = new Dog();
    d2.name = "Leo";
    d2.walk();

    Complex c1 = new Complex();
    c1.a = 3;
    c1.b = 5;
    c1.print();
  }
}

class Complex{
  int a, b;

  void print(){
    System.out.println(a + " + " + b + "i");
  }
}

// creating class starting with capital letter
class Dog {
  // these are properties
  String name;
  int age;
  String color;

  // behaviors
  void walk(){
    System.out.println(name + " is walking");
  }
  void bark(){
    System.out.println(name + " is barking");
  }

}