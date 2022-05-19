package oop.Overriding;

public class A extends B{
    /*before overriding*/
//    public static void print(){
//        System.out.println("class A");
//    }

    /*after overriding*/

    @Override
    public void print() {
        System.out.println("class A");
    }
}
