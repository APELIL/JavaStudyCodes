package oop.method;

public class D03PassByReference {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null
        D03PassByReference.change(person);
        System.out.println(person.name);//LILAPE
    }
    //class Person includes a attribute called name
public static void change(Person person){
        person.name = "LILAPE";
}
}
class Person{
    String name;
}
