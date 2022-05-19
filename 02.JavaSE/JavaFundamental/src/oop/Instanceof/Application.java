package oop.Instanceof;

public class Application {
    public static void main(String[] args) {
        /*
        relationship:
        Object -> Person -> Student
        Object -> Person -> Teacher
        Object -> String
        */
        /*
        Object object = new Student();
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof String);//false
        System.out.println("======================");
        Person person = new Person();
        System.out.println(person instanceof Object);
        System.out.println(person instanceof Person);
//        System.out.println(person instanceof Student);// error
//        System.out.println(person instanceof String);// error

        */
        /* from high to low -> cast */
        Person obj1 = new Student();
//        obj1.student(); ->invalid, you need to cast (from Person(high)->Student(low))
        Student NewObj = (Student) obj1; // or you can do like this way: ((Student)obj).student();
        NewObj.student(); // -> now it is valid

        /* from low to high */
        Student obj2 = new Student();
        // if you want to convert Student to Person:
        Person NewObj2 = obj2;
//        NewObj2.student(); -> invalid, when converting low level to high level，it is possible to lose methods of low level


    }
}
