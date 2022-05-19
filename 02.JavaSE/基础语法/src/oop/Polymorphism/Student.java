package oop.Polymorphism;
//child class
public class Student extends Person{
//    public void print(){
//        System.out.println("run child");
//    }


    @Override
    public void print() {
        System.out.println("run child");
    }
    public void study(){
        System.out.println();
    }
}
