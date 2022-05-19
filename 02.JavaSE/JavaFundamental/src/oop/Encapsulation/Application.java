package oop.Encapsulation;

public class Application {
    public static void main(String[] args) {
       Student student = new Student();
       student.setAge(121);
       student.setName("Mike");
       System.out.println(student.getAge());
        System.out.println(student.getName());

    }
}
