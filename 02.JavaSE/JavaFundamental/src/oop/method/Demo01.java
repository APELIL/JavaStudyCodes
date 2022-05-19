package oop.method;

public class Demo01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        Demo01 sum = new Demo01();
        int result = sum.sumStatic(a,b);
        System.out.println(result);
    }
//    // static method
//    public static int sum(int x, int y){
//        return x+y;
//    }
    // non-static method
    public int sumStatic(int x, int y){
        return x+y;
    }
}
