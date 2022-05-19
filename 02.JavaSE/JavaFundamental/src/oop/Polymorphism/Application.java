package oop.Polymorphism;

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        //reference of father points to child
        Person s2 = new Student();
        /*
        s1 and s2 will call method of father while method of child class is empty

        s1.print();//run father
        s2.print();//run father
        */

        /* while child method is not empty

        s1.print();//run child
        s2.print();//run child
        */

        /* while overriding */
        s1.print();//run child
        s2.print();//run child

        /*

        */
        s1.study();
        ((Student) s2).study();// father can not call method that the father class does not have
        // so you need to cast the type
    }
}
