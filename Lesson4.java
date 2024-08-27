package oops;

public class Lesson4 {
  public static void main(String[] args) {
    // access modifiers -
    // types-

    // 1. private - only within that class can use 
    Teacher obj = new Teacher();
    // obj.teacherId = 3;     // throws error
    // System.out.println(obj.teacherId);

    // 2. public - anyone can use also outside the package
    obj.teachingClass = 6;
    System.out.println(obj.teachingClass);

    // 3. default - also known as package private
    // only access within package
    // don't have to write anything to make default access modifiers
    obj.teacherDegree = "PHD";
    System.out.println(obj.teacherDegree);

    // 4. protected -
    // if we want only child classes can access it 
    Student obj1 = new Student();
    obj1.studentsCount = 100;
    System.out.println(obj1.studentsCount);
  }
}

class Teacher{
  public int teachingClass; // public

  private int teacherId;    // private

  String teacherDegree;     // default

  protected int studentsCount; // protected
}

class Student extends Teacher{
  

}

