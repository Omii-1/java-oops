package oops;

public class Lesson5 {
  public static void main(String[] args) {

    // Encapsulation -
    // bundling of fields and methods inside single class
    // it prevent outer class from accessing and changing fields and methods of class
    // helps to achieve data hiding

    Person p1 = new Person();
    p1.setAge(23);
    System.out.println(p1.getAge());

    // static variable -
    // if we want to access class members without creating instance of class, then declare class members static
    // we create main static so we dont have to create instance of class lesson5
    System.out.println(p1.num);
    Person p2 = new Person();
    p2.num = 4; // it chabge for all objects
    System.out.println(p2.num); // 4
    System.out.println(p1.num); // 4
    System.out.println(Person.num); // we can access without making object
    // static has single copy in memory so if we change in any object it change for all objects
  }
} 

class Person{

  public static int num = 10; // create static

  // these are encapsulate
  private int age;
  private String name;
  boolean hasAccess = false;

  // to work on these created setter and for access created getter method
  // they don't directly work on the privates
  // we can manage that we can give access or not

  // setter
  public void setAge(int age){
    if(hasAccess){  // now cannot access
      this.age = age;
    }
  }

  // getter
  public int getAge(){
    return age;
  }
}
