package oop.Encapsulation;

public class Student {
    private String name;
    private int age;

    /* get and set
     */
    //get
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    //set
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if (age>120||age<0){
            System.out.println("invalid age");
        }else {this.age = age;}
    }
}
