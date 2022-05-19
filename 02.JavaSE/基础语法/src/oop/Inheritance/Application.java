package oop.Inheritance;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        student.say();
        System.out.println("Child student inherit father's money $ "+ student.money);
    }
}
