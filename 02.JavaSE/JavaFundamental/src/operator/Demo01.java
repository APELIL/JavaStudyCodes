package operator;

public class Demo01 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++;//a = a + 1
        int c = ++a;
        System.out.println(a); // a = 5
        System.out.println(b);// b = 3
        System.out.println(c);// c = 5
        // exponentiation
        double pow = Math.pow(3,2);
        System.out.println(pow);

        // boolean
        boolean aa = false;
        boolean bb = true;
        System.out.println("1:"+(aa&&bb));
        // short circuit operation
        int s1 = 5;
        boolean boo = (s1<4)&&(s1++<=5);
        System.out.println("short circuit"+boo);
        System.out.println("s1 value"+s1); // s1 = 5

        // ********
        boolean boo1 = (s1>=5) && (s1++<=5);
        System.out.println("s1 value"+s1); // s1 = 6


    }
}
