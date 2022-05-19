package oop.Overriding;

public class Application {
    public static void main(String[] args) {
        /*before overriding*/
        A a = new A(); // class A
        a.print();

        // the reference of parent class B points to child class A
        B b = new A(); // class B
        b.print();
        /*after overriding*/
        /* the output of a.print() and b.print()
        * class A
        * class A
        * */
    }
}
