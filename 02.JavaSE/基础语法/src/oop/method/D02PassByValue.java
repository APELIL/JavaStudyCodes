package oop.method;

public class D02PassByValue {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);//1
        D02PassByValue.change(a);
        System.out.println(a);//1
    }
    public static void change(int a){
        a = 10;
    }
}

