package oop.InheritanceSuper;

public class Student extends Person {


    public Student(String name){}//parameter constructor
    private String name = "StudentName";
    /*test 1 for parameter*/
    public void test1(String name){
        System.out.println(name);//ApplicationName
        System.out.println(this.name);//StudentName
        System.out.println(super.name);//PersonName
    }
    /*test 2 for method*/
    public void print(){
        System.out.println("From Student");
    }

    public void test2(){
        this.print();//From Student
        super.print();//From Person
    }
    /*test 3 for constructor*/

    public Student(){
//        super();//to call parent constructor
        this("hello");//to call current constructor
        System.out.println("StudentConstructor");
    }
}
