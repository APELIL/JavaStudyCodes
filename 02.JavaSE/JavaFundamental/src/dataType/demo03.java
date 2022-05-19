package dataType;

public class demo03 {
    public static void main(String[] args){
//      binary 0b   octal 0 hex 0x (0~9 A~F)
        int n1 = 010;// n1 = 8
        int n2 = 0x10; //n2 = 16
//        float limited diversity approximate

//        =========================
//        some tricky things:
        float n3 = 0.2f;
        double n4 = 2.0/10;
        System.out.println(n3==n4);//false
//        as can be seen from above codes, we would better use same type to compare things
        float n5 = 2.0f/10;
        System.out.println(n3==n5);
        System.out.println("=========================");
//        =========================
        char a = 'a';
        char b = 'b';
        System.out.println((int)a); // unicode 97
        System.out.println((int)b); // unicode 98
        char unicode = '\u0062'; // the way to use unicode
        System.out.println(unicode); // b
//        =========================
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2);
    }

}
