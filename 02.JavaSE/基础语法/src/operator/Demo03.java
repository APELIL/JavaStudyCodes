package operator;

public class Demo03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // What is the diff between System.out.println(""+a+b) and System.out.println(a+b+"") ?
        System.out.println(""+a+b);// out: 1020
        System.out.println(a+b+"");// out: 30
    }
}
