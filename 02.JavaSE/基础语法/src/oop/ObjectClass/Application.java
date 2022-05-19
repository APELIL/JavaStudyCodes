package oop.ObjectClass;

public class Application {
    public static void main(String[] args) {
        //In here we need to initialize class-Student
        //After initialization, we can get an object of class-Student
        Student student1 = new Student();
        Student student2 = new Student();
        //Now, student1 and student2 are objects of class-Student
        //And we can assign value in Object now
        student1.name = "Mike";
        student1.age = 21;
        System.out.println(student1.name);
        student1.study();
    }
}
